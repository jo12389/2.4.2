package spring.dao;

import spring.model.User;

public interface UserDao {
    User getUserByName(String name);
}
