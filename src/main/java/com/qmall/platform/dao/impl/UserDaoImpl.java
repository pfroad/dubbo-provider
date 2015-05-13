package com.qmall.platform.dao.impl;

import com.qmall.platform.dao.UserDao;
import com.qmall.platform.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by caoyi on 5/13/15.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public User get(long id) {
        User user = new User();
        user.setId(1);
        user.setName("1stUser");
        user.setMobile("13333333333");
        user.setPassword("111111");
        return user;
    }
}
