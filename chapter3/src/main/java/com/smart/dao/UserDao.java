package com.smart.dao;

import com.smart.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 7/25 0025.
 */

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int getMatchCount(String userName, String password) {
        String sqlStr = "select count(*) from t_user where user_name = ? and password = ?";
        return jdbcTemplate.queryForInt(sqlStr, new Object[]{userName, password});
    }

    public User findUserByUserName(final String userName) {

    }

    public void updateLoginInfo(User user) {

    }
}
