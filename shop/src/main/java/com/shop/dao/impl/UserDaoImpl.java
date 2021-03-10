package com.shop.dao.impl;

import com.shop.bean.User;
import com.shop.dao.BaseDao;
import com.shop.dao.UserDao;

/**
 * @author WuLiangHang
 */
public class UserDaoImpl extends BaseDao implements UserDao {
    /**
     * 查询用户信息by用户名字
     *
     * @param username
     * @return
     */
    public User queryUserByUsername(String username) {
        String sql = "SELECT `id`, `username`, `password`, `email` FROM user WHERE `username` = ?";
        return super.queryForOne(User.class, sql, username);
    }

    /**
     * 添加用户信息
     * @param username
     * @param password
     * @param email
     * @return
     */
    public int addUser(String username, String password, String email) {
        String sql = "INSERT INTO `user`( `username`, `password`, `email`) VALUES (?,?,?)";
        return super.update(sql, username, password, email);
    }

    /**
     * 用 用户名与密码  查询用户是否存在
     * @param username
     * @param password
     * @return
     */
    public User queryCheckUser(String username, String password) {
        String sql = "SELECT `id`, `username`, `password`, `email` FROM user WHERE `username` = ? AND `password` = ?";
        return super.queryForOne(User.class, sql, username, password);
    }


}
