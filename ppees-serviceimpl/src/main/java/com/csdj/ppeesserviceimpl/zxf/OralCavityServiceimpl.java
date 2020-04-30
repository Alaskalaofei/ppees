package com.csdj.ppeesserviceimpl.zxf;

import com.csdj.mapper.zxf.OralCavityMapper;
import com.csdj.pojo.DKqDescribe;
import com.csdj.pojo.RResult;
import com.csdj.pojo.Record;
import com.csdj.pojo.SysUser;
import com.csdj.service.zxf.OralCavityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OralCavityServiceimpl implements OralCavityService {
    @Autowired
    private OralCavityMapper mapper;
    @Override
    public Record getrecordByid(Integer rid) {
        return mapper.getrecordByid(rid);
    }

    @Override
    public SysUser getUserByid(Integer id) {
        return mapper.getUserByid(id);
    }

    @Override
    public int addOralCavity(DKqDescribe dKqDescribe) {
        return mapper.addOralCavity(dKqDescribe);
    }

    @Override
    public int addrresult(RResult rResult) {
        return mapper.addrresult(rResult);
    }
}
