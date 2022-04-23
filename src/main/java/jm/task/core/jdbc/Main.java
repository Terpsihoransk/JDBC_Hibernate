package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class Main {
    public static void main(String[] args) {
        // создание таблицы User ов (не должно быть исключения, если таблица уже есть)
        UserService userRoot = new UserServiceImpl();
        userRoot.createUsersTable();
        // добавление 4х юзеров в таблицу с данными на выбор
        userRoot.saveUser("Valentin", "Ivanov", (byte) 20);
        userRoot.saveUser("Ivan", "Petrov", (byte) 22);
        userRoot.saveUser("Petr", "Sidorov", (byte) 23);
        userRoot.saveUser("Sidr", "Smirnov", (byte) 40);
        // получение всех User из базы и вывод в консоль
        System.out.println(userRoot.getAllUsers());
        // удаление User из таблицы по id
        userRoot.removeUserById(1);
        // очистка таблицы User ов
        userRoot.cleanUsersTable();
        // удаление таблицы (не должно быть исключения, если таблицы нет)
        userRoot.dropUsersTable();


    }
}

