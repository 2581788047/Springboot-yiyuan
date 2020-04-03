package com.yuan.Dao.Login;

import com.yuan.model.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "Userinfo")
public interface LoginDao {
  Userinfo QueryUserLogin(Userinfo userinfo);


}
