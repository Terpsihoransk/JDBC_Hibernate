package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class Main {
    public static void main(String[] args) {
        // создание таблицы User ов (не должно быть исключения, если таблица уже есть)
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        // добавление 4х юзеров в таблицу с данными на выбор
        userService.saveUser("Valentin", "Ivanov", (byte) 20);
        userService.saveUser("Ivan", "Petrov", (byte) 22);
        userService.saveUser("Petr", "Sidorov", (byte) 23);
        userService.saveUser("Sidr", "Smirnov", (byte) 40);
        // получение всех User из базы и вывод в консоль
        System.out.println(userService.getAllUsers());
        // удаление User из таблицы по id
        userService.removeUserById(1);
        // очистка таблицы User ов
        userService.cleanUsersTable();
        // удаление таблицы (не должно быть исключения, если таблицы нет)
        userService.dropUsersTable();


    }
}

