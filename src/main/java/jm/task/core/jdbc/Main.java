package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        User user = new User("Ilya", "Garifulin", (byte)26);
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();



    }
}
