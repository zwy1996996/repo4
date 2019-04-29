package cn.itheima.dao.impl;


import cn.itheima.dao.UserDao;
import cn.itheima.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());


}
