package com.csdj.controller.zxf;

import com.csdj.pojo.RResult;
import com.csdj.pojo.Record;
import com.csdj.pojo.SysUser;
import com.csdj.pojo.XRayExamineResult;
import com.csdj.service.zxf.XrayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("Xray")
public class XrayConteroller {
    @Autowired
    private XrayService service;
    @RequestMapping("goxradialm")
    public String goxradialm(){
        return "xradialm";
    }
    @RequestMapping("goxradialf")
    public String goxradialf(){
        return "xradialf";
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
    @RequestMapping("addXrayexamine")
    @ResponseBody
    public Object addXrayexamine(XRayExamineResult result){
        result.setExaminedate(new Date());
        int jg= service.addXrayexamine(result);
        if (jg>0){
            return "true";
        }else{
            return "false";
        }
    }
}
