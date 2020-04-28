package com.csdj.ppeesserviceimpl.lx;

import com.csdj.mapper.lx.RecordMapper;
import com.csdj.pojo.Record;
import com.csdj.service.lx.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class RecordServiceimpl implements RecordService {

    @Autowired
    private RecordMapper mapper;

    @Override
    public List<Record> findgetRecordByRecord(String creationtime,
                                              String fcertificate,
                                              String fname,
                                              String bcertificate,
                                              String bname,
                                              String fbirth,
                                              String birth,
                                              Integer rid,
                                              Integer index, Integer pageSize) {
        return mapper.getRecordByRecord(creationtime,fcertificate,fname,bcertificate,bname,fbirth,birth,rid,(index-1)*pageSize,pageSize);
    }

    @Override
    public Integer findgetRecordByRecordCount(String creationtime,
                                              String fcertificate,
                                              String fname,
                                              String bcertificate,
                                              String bname,
                                              String fbirth,
                                              String birth,
                                              Integer rid) {
        return mapper.getRecordByRecordCount(creationtime,fcertificate,fname,bcertificate,bname,fbirth,birth,rid);
    }

    @Override
    public Record findgetRecordByRid(Integer rid) {
        return mapper.getRecordByRid(rid);
    }
}
