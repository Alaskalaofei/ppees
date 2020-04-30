package com.csdj.ppeesserviceimpl.zxf;

import com.csdj.mapper.zxf.RoutineExaminationMapper;
import com.csdj.pojo.RResult;
import com.csdj.pojo.Record;
import com.csdj.pojo.SysUser;
import com.csdj.service.zxf.RoutineExaminationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoutineExaminationServiceimpl implements RoutineExaminationService {
    @Autowired
    private RoutineExaminationMapper mapper;
    @Override
    public Record getrecordByid(Integer rid) {
        return mapper.getrecordByid(rid);
    }

    @Override
    public SysUser getUserByid(Integer id) {
        return mapper.getUserByid(id);
    }

    @Override
    public int addrresult(RResult rResult) {
        return mapper.addrresult(rResult);
    }
}
