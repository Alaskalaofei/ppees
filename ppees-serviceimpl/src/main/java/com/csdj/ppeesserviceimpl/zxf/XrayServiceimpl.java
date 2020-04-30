package com.csdj.ppeesserviceimpl.zxf;

import com.csdj.mapper.zxf.XrayMapper;
import com.csdj.pojo.RResult;
import com.csdj.pojo.Record;
import com.csdj.pojo.SysUser;
import com.csdj.pojo.XRayExamineResult;
import com.csdj.service.zxf.XrayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XrayServiceimpl implements XrayService {
    @Autowired
    private XrayMapper mapper;
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

    @Override
    public int addXrayexamine(XRayExamineResult result) {
        return mapper.addXrayexamine(result);
    }
}
