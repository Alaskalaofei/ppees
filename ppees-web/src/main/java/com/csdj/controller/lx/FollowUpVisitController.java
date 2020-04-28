package com.csdj.controller.lx;

import com.alibaba.fastjson.JSON;
import com.csdj.pojo.FollowUpVisit;
import com.csdj.pojo.Record;
import com.csdj.service.lx.FollowUpVisitService;
import com.csdj.util.HttpClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/FollowUpVisitController")
public class FollowUpVisitController {

    @Autowired
    private FollowUpVisitService service;

    @RequestMapping("/FollowUpVisitBydate")
    public String FollowUpVisitBydate(String creationtime1,String creationtime2, Integer index, Integer pageSize)
    {
        if(index==null || index==0){
            index=1;
        };
        /*查询*/
        List<FollowUpVisit> followUpVisits=service.findgetFollowUpVisitBydate(creationtime1,creationtime2,index,pageSize);
        /*总数*/
        Integer count=service.getFollowUpVisitBydateByCoutn(creationtime1,creationtime2);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("data", followUpVisits);
        map.put("count", count);
        map.put("msg", "");

        return  JSON.toJSONString(map);
    }

    @RequestMapping("/FRecordByRecord")
    public String FRecordByRecord(String fname,String fcertificate,String creationtime1,String creationtime2, Integer index, Integer pageSize)
    {
        if(index==null || index==0){
            index=1;
        };
        /*查询*/
        List<Record> recordList=service.findgetFRecordByRecord(fname,fcertificate,creationtime1,creationtime2,index,pageSize);
        /*总数*/
        Integer count=service.getFRecordByRecordByCount(fname,fcertificate,creationtime1,creationtime2);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("data", recordList);
        map.put("count", count);
        map.put("msg", "");

        return  JSON.toJSONString(map);
    }


    //用户名
  /*  @Value("${sms.Uid}")*/
    private static String Uid="saolaofei";

    //接口安全秘钥
/*    @Value("${sms.Key}")*/
    private static String Key="bilibili2019sms";

    @RequestMapping(value="/addlistsms")
    @ResponseBody
    public Integer addlistsms(@RequestBody List<Record> records)
    {
        /*短信接口*/
        HttpClientUtil client = HttpClientUtil.getInstance();
        /*发送短信总数*/
        Integer smsresult = 0;
        /*待添加的已发短信的数据*/
        List<FollowUpVisit> addfoll=new ArrayList<>();
        FollowUpVisit followUpVisit;
        for (Record record:records) {
            StringBuilder sb = new StringBuilder("尊敬的,你好,请到检验报告科拿取报告");//构造一个StringBuilder对象（尊敬的,你好,请到检验报告科拿取报告）
            sb.insert(3, record.getFname());//在指定的位置1，插入指定的字符串
            String smsText = sb.toString();
//UTF发送
            int result = client.sendMsgUtf8(Uid, Key, smsText, record.getFphone());
            if(result>0){
                System.out.println("UTF8成功发送条数=="+result);
                smsresult+=1;
            /*判断是否发送成功*/
                if(result>=1) {
                     followUpVisit=new FollowUpVisit();
                    /*添加到添加的已发短信的数据*/
                    followUpVisit.setRid(record.getRid());
                    followUpVisit.setAssessmentcontent(smsText);
                    addfoll.add(followUpVisit);
                }
            }else{
                System.out.println(client.getErrorMsg(result));
            }
        }
        /*访问数据库批量添加已发消息*/
        Integer follcount=service.findaddFollowUpVisit(addfoll);
/*返回数据*/
            return follcount;
    }

}
