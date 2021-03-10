package com.shop.dao;

import com.shop.bean.User;

/**
 * @author WuLiangHang
 */
public interface UserDao {
    /**
     * 根据用户名查询用户信息
     *
     * @param username
     * @return 如果返回null 说明没有这个用户
     */
    public User queryUserByUsername(String username);

    /**
     * 添加用户信息
     * @param username
     * @param password
     * @param email
     * @return
     */
    public int addUser(String username,String password,String email);

    /**
     *用 用户名与密码  查询用户是否存在
     * @param username
     * @param password
     * @return
     */
    public User queryCheckUser(String username,String password);
}
