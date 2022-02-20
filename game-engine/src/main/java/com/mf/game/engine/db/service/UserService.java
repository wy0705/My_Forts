package com.mf.game.engine.db.service;

import com.mf.game.engine.db.dao.hbaseImpl.UserUtil;

import com.mf.game.engine.db.entry.User;
import com.mf.game.engine.redis.RedisUtil;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class UserService {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private UserUtil userUtil;
//注册用户名，手机号，密码放入hbase

    public User Register(String name,String phone,String password) throws IOException {
        return userUtil.add(name, phone, password);
    }

    //用户先到redis查看没有再到hbase
    public boolean login(String name,String password) throws IOException {
       return userUtil.loginUser(name, password);
    }
}
