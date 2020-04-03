package com.yuan.Service.Login.Loginserviceimp;

import com.yuan.Dao.Login.LoginDao;
import com.yuan.Service.Login.LoginService;
import com.yuan.Utils.CommitUtil;
import com.yuan.model.ResponseModel;
import com.yuan.model.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Response;

public class LoginServiceimp implements LoginService {
    //登录接口
    @Autowired
    LoginDao loginDao;
    @Override
    public ResponseModel QueryService(Userinfo userinfo,HttpServletRequest request) {
        Userinfo userinfors=loginDao.QueryUserLogin(userinfo);
        if (userinfo!=null){
            if ("01".equals(userinfors.getLoginstatus())){
                return CommitUtil.resPonseFal("当前账号已被冻结，请联系管理员解冻");
            }
                request.getSession().setAttribute("userid", userinfors.getId());
                return CommitUtil.resPonseFal("登录成功");

        }else {
            return CommitUtil.resPonseFal("登录失败");
        }

    }

}
