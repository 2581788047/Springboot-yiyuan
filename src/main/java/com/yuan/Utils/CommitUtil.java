package com.yuan.Utils;

import com.yuan.model.ResponseModel;

public class CommitUtil {
    /**
     * 增删改失败返回的方法
     * @author:  杨远远
     * @Date:  2020/4/9
     * @Param:  [messAge] 操作失败返回的信息（例：请输入您要添加的用户名）
     * @return:  com.OuSoft.system.entity.ResponseModel
     */
    public static ResponseModel resPonseFal(String messAge){
        ResponseModel remodel = new ResponseModel();
        remodel.setCode("404");
        remodel.setResult("fail");
        remodel.setTime(System.currentTimeMillis()+"");
        remodel.setToken("0053");
        remodel.setMsg(messAge);
        return remodel;
    }
    /**
     * 增删改成功返回的方法
     * @author:  杨远远
     * @Date:  2020/4/9
     * @Param:  [messAge] 操作失败返回的信息（例：请输入您要添加的用户名）
     * @return:  com.OuSoft.system.entity.ResponseModel
     */
    public static ResponseModel resPonseTrue(String messAge){
        ResponseModel remodel = new ResponseModel();
        remodel.setCode("200");
        remodel.setResult("success");
        remodel.setTime(System.currentTimeMillis()+"");
        remodel.setToken("001");
        remodel.setMsg(messAge);
        return remodel;
    }
}
