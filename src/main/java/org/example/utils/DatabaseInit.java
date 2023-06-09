/*
package com.kikomori.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.kikomori.models.Role;
import com.kikomori.models.User;
import com.kikomori.services.RoleServiceImpl;
import com.kikomori.services.UserServiceImpl;

import javax.annotation.PostConstruct;
import java.util.Set;

@Component
public class DatabaseInit {

    private final UserServiceImpl userService;
    private final RoleServiceImpl roleService;

    @Autowired
    public DatabaseInit(UserServiceImpl userService, RoleServiceImpl roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void postConstruct() {
        Role roleUser = new Role("ROLE_USER");
        Role roleAdmin = new Role("ROLE_ADMIN");

        User user = new User("user", "user", 18, "user@gmail.com", "user");
        User admin = new User("admin", "admin", 18, "admin@gmail.com", "admin");

        user.setRoles(Set.of(roleUser));
        admin.setRoles(Set.of(roleAdmin, roleUser));

        roleService.save(roleUser);
        roleService.save(roleAdmin);

        userService.save(user);
        userService.save(admin);
    }
}
*/