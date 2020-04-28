package com.csdj.ppeesserviceimpl.lx;

import com.csdj.mapper.lx.FollowUpVisitMapper;
import com.csdj.pojo.FollowUpVisit;
import com.csdj.pojo.Record;
import com.csdj.service.lx.FollowUpVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FollowUpVisitServiceimpl implements FollowUpVisitService {

    @Autowired
    private FollowUpVisitMapper mapper;

    @Override
    public List<FollowUpVisit> findgetFollowUpVisitBydate(String creationtime1, String creationtime2, Integer index, Integer pageSize) {
        return mapper.getFollowUpVisitBydate(creationtime1,creationtime2,(index-1)*pageSize, pageSize);
    }

    @Override
    public Integer getFollowUpVisitBydateByCoutn(String creationtime1, String creationtime2) {
        return mapper.getFollowUpVisitBydateByCoutn(creationtime1,creationtime2);
    }

    @Override
    public List<Record> findgetFRecordByRecord(String fname,String fcertificate,String creationtime1,String creationtime2, Integer index, Integer pageSize) {
        return mapper.getFRecordByRecord(fname,fcertificate,creationtime1,creationtime2,(index-1)*pageSize, pageSize);
    }

    @Override
    public Integer getFRecordByRecordByCount(String fname, String fcertificate, String creationtime1, String creationtime2) {
        return mapper.getFRecordByRecordByCount(fname,fcertificate,creationtime1,creationtime2);
    }

    @Override
    public Integer findaddFollowUpVisit(List<FollowUpVisit> followUpVisitList){
        return mapper.addFollowUpVisit(followUpVisitList);
    }
}
