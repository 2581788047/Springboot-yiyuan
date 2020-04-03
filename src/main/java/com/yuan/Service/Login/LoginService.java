package com.yuan.Service.Login;

import com.yuan.model.ResponseModel;
import com.yuan.model.Userinfo;

import javax.servlet.http.HttpServletRequest;

public interface LoginService {
    ResponseModel QueryService(Userinfo userinfo, HttpServletRequest request);
}
