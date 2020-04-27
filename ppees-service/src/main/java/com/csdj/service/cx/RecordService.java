package com.csdj.service.cx;

import com.csdj.pojo.Record;

import java.util.Date;
import java.util.List;


public interface RecordService {
    /**
     * 档案查询
     * @return
     */
   public   List<Record> getlistRecord(Integer rid, Date creationtime1,Date creationtime2,String fname, String bname, String  fcertificate, Date fbirth, String  bcertificate, Date birth, Integer curPageNo, Integer pageSize);

    public  int getLeaveCount(Integer rid,Date creationtime1,Date creationtime2,  String fname, String bname,String  fcertificate, Date fbirth, String  bcertificate,  Date birth);

    Record getid(Integer rid );
}
