package com.csdj.controller.zxf;

import com.csdj.pojo.RResult;
import com.csdj.pojo.Record;
import com.csdj.pojo.SysUser;
import com.csdj.service.zxf.RoutineExaminationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("Routine")
public class RoutineExaminationController {
    @Autowired
    private RoutineExaminationService service;
    @RequestMapping("goregular_projectm")
    public String goregular_projectm(){
        return "regular_projectm";
    }
    @RequestMapping("goregular_projectf")
    public String goregular_projectf(){
        return "regular_projectf";
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
    @RequestMapping("addRResult")
    @ResponseBody
    public Object addRResult(RResult rResult){
        int jg= service.addrresult(rResult);
        if (jg>0){
            return "true";
        }else{
            return "false";
        }
    }
}
