package com.csdj.controller.lx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/GetControll")
public class GetControll {
    @Autowired
    private testService service;

    /**
     * 测试
     * @param model
     * @return
     */
    @RequestMapping("/getlist")
    public String getlist(Model model)
    {
        model.addAttribute("lists",service.gettest());
        return "list";
    }

    /**
     * 自定义发送短信页面页面
     * @return
     */
    @RequestMapping("getcustomsms")
    public String getcustomsms()
    {
        return "customsms";
    }

    /**
     * 已发送短信列表页面
     * @return
     */
    @RequestMapping("gettexted")
    public String gettexted()
    {
        return "texted";
    }

    /**
     * 超声影像页面
     * @return
     */
    @RequestMapping("getopentheultrasoundimage")
    public String getopentheultrasoundimage()
    {
        return "opentheultrasoundimage";
    }

    /**
     * 查询档案信息页面
     * @return
     */
    @RequestMapping("getbasicfiles")
    public String getbasicfiles()
    {
        return "basicfiles";
    }

    /**
     * 用户管理页面
     * @return
     */
    @RequestMapping("getusermanagement")
    public String getusermanagement()
    {
        return "usermanagement";
    }

}
