package com.csdj.controller.zxf;

import com.alibaba.fastjson.JSON;
import com.csdj.pojo.*;
import com.csdj.service.zxf.InspectionResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("InspectionResults")
public class InspectionResultsController {
    @Autowired
    private InspectionResultsService service;
    @RequestMapping("goexamine_resultm")
    public String goexamine_resultm(){
        return "examine_resultm";
    }
    @RequestMapping("goexamine_resultf")
    public String goexamine_resultf(){
        return "examine_resultf";
    }
    @RequestMapping("getRResult")
    @ResponseBody
    public Object getRResult(String certificate){
        List<RResult> jg= service.getRResult(certificate);
        int count=service.getRResultCount(certificate);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("data", jg);
        map.put("count", count);
        map.put("msg", "");
        return JSON.toJSONString(map);
    }
    @RequestMapping("getrecordByid")
    @ResponseBody
    public Object getrecordByid(HttpSession session){
        Record list= (Record) session.getAttribute("Record");
        Record record=service.getrecordByid(list.getRid());
        return record;
    }
    @RequestMapping("getUserByid")
    @ResponseBody
    public Object getUserByid(HttpSession session){
        SysUser user2= (SysUser) session.getAttribute("usersession");
        SysUser user=service.getUserByid(user2.getId());
        return user;
    }

    @RequestMapping("addrresult2")
    @ResponseBody
    public Object addrresult2(RResult2 rResult){
        rResult.setRegistrationtime(new Date());
        int jg= service.addrresult2(rResult);
        if (jg>0){
            return "true";
        }else{
            return "false";
        }
    }

}
