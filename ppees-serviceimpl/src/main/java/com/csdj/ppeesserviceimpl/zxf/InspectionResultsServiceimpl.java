package com.csdj.ppeesserviceimpl.zxf;

import com.csdj.mapper.zxf.InspectionResultsMapper;
import com.csdj.pojo.RResult;
import com.csdj.pojo.RResult2;
import com.csdj.pojo.Record;
import com.csdj.pojo.SysUser;
import com.csdj.service.zxf.InspectionResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InspectionResultsServiceimpl implements InspectionResultsService {
    @Autowired
    private InspectionResultsMapper mapper;


    @Override
    public List<RResult> getRResult(String certificate) {
        return mapper.getRResult(certificate);
    }

    @Override
    public int getRResultCount(String certificate) {
        return mapper.getRResultCount(certificate);
    }

    @Override
    public Record getrecordByid(Integer rid) {
        return mapper.getrecordByid(rid);
    }

    @Override
    public SysUser getUserByid(Integer id) {
        return mapper.getUserByid(id);
    }

    @Override
    public int addrresult2(RResult2 rResult2) {
        return mapper.addrresult2(rResult2);
    }
}
