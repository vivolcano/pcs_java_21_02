package ru.pcs.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.pcs.web.models.User;
import ru.pcs.web.repositories.UsersRepository;

/**
 * 01.12.2021
 * 27. Spring Boot
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Controller
public class UsersController {
    // DI
    @Autowired
    private UsersRepository usersRepository;

    @PostMapping("/users")
    public String addUser(@RequestParam("firstName") String firstName,
                          @RequestParam("lastName") String lastName) {

        User user = User.builder()
                .firstName(firstName)
                .lastName(lastName)
                .build();

        usersRepository.save(user);

        return "redirect:/users_add.html";
    }
}
