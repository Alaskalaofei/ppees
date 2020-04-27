package com.csdj.controller.cx;

import com.alibaba.fastjson.JSON;
import com.csdj.pojo.Record;
import com.csdj.service.cx.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("cxRecord")
public class RController {

    @Autowired
    private RecordService service;

    /**
     *
     * @param
     * @return
     */
    @RequestMapping("/getRecord")
    public String getRecord()
    {
        return "page";
    }

    @RequestMapping("page")
    @ResponseBody
    public String page(Integer rid, @DateTimeFormat(pattern="yyyy-MM-dd")Date creationtime1, @DateTimeFormat(pattern="yyyy-MM-dd")Date creationtime2, String fname, String bname, String  fcertificate, @DateTimeFormat(pattern="yyyy-MM-dd")Date fbirth, String  bcertificate,@DateTimeFormat(pattern="yyyy-MM-dd") Date birth, Integer page, Integer limit, Model model){

        model.addAttribute("code",0);
        model.addAttribute("msg", "");
        model.addAttribute("count", service.getLeaveCount(rid,creationtime1,creationtime2,fname,bname,fcertificate,fbirth,bcertificate,birth));
        model.addAttribute("data", service.getlistRecord(rid,creationtime1,creationtime2,fname,bname,fcertificate,fbirth,bcertificate,birth,page,limit));
        return JSON.toJSONString(model);
    }

    @RequestMapping("deleteByid")
    @ResponseBody
    public String deleteByid(Integer rid, HttpSession  session){
        Record list=service.getid(rid);
        session.setAttribute("rid", rid);
        System.out.println(rid);
        return  "null";
    }

    @RequestMapping("getnanHealth")
    public String getnanHealth(){
        return  "nanHealth";
    }


}
