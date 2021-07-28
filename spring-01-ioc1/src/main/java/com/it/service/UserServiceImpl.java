package com.it.service;

import com.it.dao.UserDao;
import com.it.dao.UserDaoMysqlImpl;
import com.it.dao.UserDaoOracIeImpl;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    //利用set动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
