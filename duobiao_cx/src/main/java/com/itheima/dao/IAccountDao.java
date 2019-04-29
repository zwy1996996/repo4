package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IAccountDao {

    List<Account> findAll();

}
