package com.csdj.controller.lx;

import com.alibaba.fastjson.JSON;
import com.csdj.pojo.Record;
import com.csdj.service.lx.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/RecordController")
public class RecordController {

    @Autowired
    private RecordService service;

    @RequestMapping("/recordlist")
    public String recordlist(String creationtime,
                             String fcertificate,
                             String fname,
                             String bcertificate,
                             String bname,
                             String fbirth,
                             String birth,
                             Integer rid
                         ,Integer index,Integer pageSize){

        if(index==null || index==0){
            index=1;
        };
        /*查询所有用户*/
        List<Record> recordList=service.findgetRecordByRecord(creationtime,fcertificate,fname,bcertificate,bname,fbirth,birth,rid,index,pageSize);
        //*查询所有用户数量*//*
        Integer count=service.findgetRecordByRecordCount(creationtime,fcertificate,fname,bcertificate,bname,fbirth,birth,rid);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("data", recordList);
        map.put("count", count);
        map.put("msg", "");

        return  JSON.toJSONString(map);
    }

    /**
     * 查询档案信息
     * @param rid
     * @return
     */
    @RequestMapping("/getRecordByRid")
    public Record getRecordByRid(Integer rid)
    {

        return service.findgetRecordByRid(rid);
    }

}
