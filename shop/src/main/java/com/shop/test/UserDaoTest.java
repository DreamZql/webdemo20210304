package com.shop.test;

import com.shop.dao.UserDao;
import com.shop.dao.impl.UserDaoImpl;
import org.junit.Test;

/**
 * @author WuLiangHang
 */
public class UserDaoTest {

    UserDao userDao = new UserDaoImpl();
//    @Test
//    public void queryUserByUsername(){
//        System.out.println(userDao.queryUserByUsername("123"));
//    }

//    @Test
//    public void addUser(){
////       userDao.addUser("123","123","123");//添加成功
//    }
    @Test
    public void  queryCheckUser(){
        userDao.queryCheckUser("admin","123");
        System.out.println(userDao.queryCheckUser("admin","123456"));
    }
}
