package dao;

import com.codegym.model.Login;
import com.codegym.model.User;


import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(10);
        u1.setName("Hau");
        u1.setAccount("Hau");
        u1.setEmail("haudz@gmail.com");
        u1.setPassword("123456");
        users.add(u1);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())
            ) {
                return u;
            }
        }
        return null;
    }

}