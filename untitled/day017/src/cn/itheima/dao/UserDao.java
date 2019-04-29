package cn.itheima.dao;

import cn.itheima.domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    public List<User> findAll();
    User findUserByUsernameAndPassword(String username, String password);
    void add(User user);
    void delete(int id);
    User findById(int i);
    List<User> findByPage(int start, int rows, Map<String, String[]> condition);
    void update(User user);
}
