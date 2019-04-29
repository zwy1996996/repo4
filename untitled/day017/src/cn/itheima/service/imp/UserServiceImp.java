package cn.itheima.service.imp;

import cn.itheima.dao.UserDao;
import cn.itheima.dao.imp.UserDaoImp;
import cn.itheima.domain.PageBean;
import cn.itheima.domain.User;
import cn.itheima.service.UserService;

import java.util.List;
import java.util.Map;

public class UserServiceImp implements UserService{
    private UserDao dao =  new UserDaoImp();


    @Override
    public List<User> findAll() {
        return dao.findAll();
    }

    @Override
    public User login(User user) {
        return dao.findUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public void addUser(User user) {
        dao.add(user);
    }

    @Override
    public void deleteUser(String id) {
    dao.delete(Integer.parseInt(id));
    }



    @Override
    public User findUserById(String id) {
        return  dao.findById(Integer.parseInt(id));

    }

    @Override
    public void updateUser(User user) {
        dao.update(user);
    }


}
