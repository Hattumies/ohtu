package ohtu.services;

import ohtu.domain.User;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ohtu.data_access.UserDao;

public class AuthenticationService {

    private UserDao userDao;

    public AuthenticationService(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean logIn(String username, String password) {
        for (User user : userDao.listAll()) {
            if (user.getUsername().equals(username)
                    && user.getPassword().equals(password)) {
                return true;
            }
        }

        return false;
    }

    public boolean createUser(String username, String password) {
        if (userDao.findByName(username) != null) {
            return false;
        }

        if (invalid(username, password)) {
            return false;
        }

        userDao.add(new User(username, password));

        return true;
    }

    private boolean invalid(String username, String password) {
        if(username.length() > 8) {
            for(char c : username.toCharArray()) {
                if(c == 'å' || c == 'ä' || c == 'ö') {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return true;
        }
        
        if(password.length() > 3) {
            if(password.matches("^(?=.*[a-z]).*$")) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }
}
