package com.yuan.Utils;

import com.yuan.model.ResponseModel;

public class CommitUtil {
    public static ResponseModel resPonseFal(String messAge){
        ResponseModel remodel = new ResponseModel();
        remodel.setCode("404");
        remodel.setResult("fail");
        remodel.setTime(System.currentTimeMillis()+"");
        remodel.setToken("0053");
        remodel.setMsg(messAge);
        return remodel;
    }
}
