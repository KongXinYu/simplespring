package com.wzy.controller.superadmin;



import com.wzy.entity.bo.HeadLine;
import com.wzy.entity.dto.Result;
import com.wzy.service.solo.HeadLineService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


public class HeadLineOperationController {

    private HeadLineService headLineService;

    public Result<Boolean> addHeadLine(){
        HeadLine headLine = new HeadLine();
        Result<Boolean> result = headLineService.addHeadLine(headLine);
        return result;
    }

    public void removeHeadLine(){
        System.out.println("删除HeadLine");
    }
    public Result<Boolean> modifyHeadLine(HttpServletRequest req, HttpServletResponse resp){
        //TODO:参数校验以及请求参数转化
        return headLineService.modifyHeadLine(new HeadLine());
    }
    public Result<HeadLine> queryHeadLineById(HttpServletRequest req, HttpServletResponse resp){
        //TODO:参数校验以及请求参数转化
        return headLineService.queryHeadLineById(1);
    }

    public Result<List<HeadLine>>queryHeadLine(){
        return headLineService.queryHeadLine(null, 1, 100);
    }


}
