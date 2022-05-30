package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

        // реализуйте алгоритм здесь
        private static final UserService userService = new UserServiceImpl();
        private static final User user1 = new User("name1", "lastName1", (byte) 10);
        private static final User user2 = new User("name2", "lastName2", (byte) 20);
        private static final User user3 = new User("name3", "lastName3", (byte) 30);
        private static final User user4 = new User("name4", "lastName4", (byte) 40);

    public static void main(String[] args) {
            userService.createUsersTable();

            userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());

            userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());

            userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());

            userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());

            userService.getAllUsers();

            userService.cleanUsersTable();

            userService.dropUsersTable();
        }
    }
