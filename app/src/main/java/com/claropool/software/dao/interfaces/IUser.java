package com.claropool.software.dao.interfaces;

import com.claropool.software.entity.User;

import java.util.ArrayList;

public interface IUser {
    public User findOneById(String id);
    public User findLastLogged();
    public User findOneByUsername(String username);
    public long insert(User usuarioBean);
    public ArrayList<User> findAllByUsername(String username);
}
