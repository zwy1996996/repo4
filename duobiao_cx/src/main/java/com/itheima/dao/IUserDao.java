package com.itheima.dao;

import com.itheima.domain.User;

public interface IUserDao {

    User findById(Integer id);
}
