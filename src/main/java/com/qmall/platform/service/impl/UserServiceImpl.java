package com.qmall.platform.service.impl;

import com.qmall.platform.dao.UserDao;
import com.qmall.platform.model.User;
import com.qmall.platform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by caoyi on 5/13/15.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String sayHello(String msg) {
        return "Hello " + msg;
    }

    public User getUser(long id) {
        return userDao.get(id);
    }

}
