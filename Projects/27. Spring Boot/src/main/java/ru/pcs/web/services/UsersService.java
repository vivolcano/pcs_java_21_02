package ru.pcs.web.services;

import ru.pcs.web.forms.UserForm;
import ru.pcs.web.models.User;

import java.util.List;

/**
 * 03.12.2021
 * 27. Spring Boot
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface UsersService {
    void addUser(UserForm form);
    List<User> getAllUsers();

    void deleteUser(Long userId);

    User getUser(Long userId);
}
