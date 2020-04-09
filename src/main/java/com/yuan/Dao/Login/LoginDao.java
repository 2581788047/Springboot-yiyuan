package com.yuan.Dao.Login;

import com.yuan.model.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "UserinfoDao")
public interface LoginDao {
  /*登录查询接口*/
  Userinfo QueryUserLogin(Userinfo userinfo);


}
