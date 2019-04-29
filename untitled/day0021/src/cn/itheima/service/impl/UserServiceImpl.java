package cn.itheima.service.impl;


import cn.itheima.dao.UserDao;
import cn.itheima.dao.impl.UserDaoImpl;
import cn.itheima.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();


}
