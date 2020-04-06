package com.yuan.Service.User.UserServiceImp;

import com.yuan.Dao.User.UserDao;
import com.yuan.Service.User.Userservice;
import com.yuan.model.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserserviceImp implements Userservice {
    @Autowired
    UserDao userDao;
    @Override
    public List<Userinfo> queryuserinfoService(Userinfo userinfo) {
        //不传参为全查，，可以默认为查询在职的
        return userDao.queryuserListDao(userinfo);
    }

}
