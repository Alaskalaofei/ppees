package com.csdj.controller.lx;

import com.alibaba.fastjson.JSON;
import com.csdj.pojo.smstemplate;
import com.csdj.service.lx.SmsTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("SmsTemplateContrpller")
public class SmsTemplateContrpller {
    @Autowired
    private SmsTemplateService service;

    @RequestMapping("/getsmstemplater")
    public String getsmstemplater(String smstemplatecontent, Integer index, Integer pageSize)
    {
        if(index==null || index==0)
        {
            index=1;
        }
        /*数据*/
        List<smstemplate> smstemplateList=service.findsmstemplate(smstemplatecontent,index,pageSize);
        Integer count=service.findsmstemplatecount(smstemplatecontent);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("data", smstemplateList);
        map.put("count", count);
        map.put("msg", "");

        return JSON.toJSONString(map);
    }
/*判断模板内容是否为空，为空就添加*/
    @RequestMapping("smstemplatecontentyesnotnull")
    public String smstemplatecontentyesnotnull(String smstemplatecontent)
    {
        /*获取数据，用来判断是否为空*/
        smstemplate smstemplate=service.findsmstemplateBysmstemplatecontent(smstemplatecontent);
        if(smstemplate==null)
        {
            return "yes";
        }
        return "no";
    }

    @RequestMapping("addsmstemplate")
    public String addsmstemplate(String smstemplatecontent)
    {
        smstemplate smstemplate=new smstemplate();
        smstemplate.setSmstemplatecontent(smstemplatecontent);
        Integer count=service.findaddsmstemplate(smstemplate);
        if(count>=1)
        {
            return "yes";
        }
        return "no";
    }

}
