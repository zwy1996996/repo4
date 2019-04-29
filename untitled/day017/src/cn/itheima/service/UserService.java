package cn.itheima.service;

import cn.itheima.domain.PageBean;
import cn.itheima.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    public List<User> findAll();
    User login(User user);
    void addUser(User user);
    void deleteUser(String id);

    User findUserById(String id);
    void updateUser(User user);

}
