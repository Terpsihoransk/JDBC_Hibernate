package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Valentin", "Ivanov", (byte) 20);
        userService.saveUser("Ivan", "Petrov", (byte) 22);
        userService.saveUser("Petr", "Sidorov", (byte) 23);
        userService.saveUser("Sidr", "Smirnov", (byte) 40);
        userService.saveUser("Makar", "Ovechkin", (byte) 40);

        System.out.println(userService.getAllUsers());

        userService.removeUserById(2);

        userService.cleanUsersTable();

        userService.dropUsersTable();


    }
}

