package com.yuan.Controller.User;

import com.yuan.Service.User.Userservice;
import com.yuan.model.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class Usercontroller {
    @Autowired
    HttpServletRequest request;
    @Autowired
    Userservice userservice;

    @RequestMapping(value = "/queryuserinfo")
    @ResponseBody
    public List<Userinfo> queryPeopleTuserController(Userinfo userinfo) {
        return userservice.queryuserinfoService(userinfo);
    }
}
