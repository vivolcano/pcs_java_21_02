package ru.pcs.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.pcs.web.forms.UserForm;
import ru.pcs.web.models.Car;
import ru.pcs.web.models.User;
import ru.pcs.web.repositories.UsersRepository;
import ru.pcs.web.services.UsersService;

import java.util.List;

/**
 * 01.12.2021
 * 27. Spring Boot
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Controller
public class UsersController {

    private final UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/users")
    public String getUsersPage(Model model) {
        List<User> users = usersService.getAllUsers();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/users/{user-id}")
    public String getUserPage(Model model, @PathVariable("user-id") Integer userId) {
        User user = usersService.getUser(userId);
        model.addAttribute("user", user);
        return "user";
    }
    @PostMapping("/users")
    public String addUser(UserForm form) {
        usersService.addUser(form);
        return "redirect:/users";
    }

    @PostMapping("/users/{user-id}/delete")
    public String deleteUser(@PathVariable("user-id") Integer userId) {
        usersService.deleteUser(userId);
        return "redirect:/users";
    }

    @PostMapping("/users/{user-id}/update")
    public String update(@PathVariable("user-id") Integer userId) {
        // TODO: нужна реализация
        return "redirect:/users";
    }

    @GetMapping("/users/{user-id}/cars")
    public String getCarsByUser(Model model, @PathVariable("user-id") Integer userId) {
        List<Car> cars = usersService.getCarsByUser(userId);
        List<Car> unusedCars = usersService.getCarsWithoutOwner();
        model.addAttribute("userId", userId);
        model.addAttribute("cars", cars);
        model.addAttribute("unusedCars", unusedCars);
        return "cars_of_user";
    }

    @PostMapping("/users/{user-id}/cars")
    public String addCarToUser(@PathVariable("user-id") Integer userId, @RequestParam("carId") Integer carId) {
        usersService.addCarToUser(userId, carId);
        return "redirect:/users/" + userId + "/cars";
    }
}
