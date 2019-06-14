package com.chentao;

import com.chentao.bean.User;
import com.chentao.mapper.UserMapper;
import com.chentao.sqlmap.MySqlSession;

public class MyBatis {

    public static void main(String[] args) {
        MySqlSession mySqlSession = new MySqlSession();
        UserMapper mapper = mySqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
    }
}
