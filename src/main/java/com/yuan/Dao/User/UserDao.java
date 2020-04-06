package com.yuan.Dao.User;

import com.yuan.model.Userinfo;

import java.util.List;

public interface UserDao {
    List<Userinfo> queryuserListDao(Userinfo userinfo);
}
