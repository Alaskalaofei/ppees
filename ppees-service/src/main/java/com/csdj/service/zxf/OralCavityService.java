package com.csdj.service.zxf;

import com.csdj.pojo.DKqDescribe;
import com.csdj.pojo.RResult;
import com.csdj.pojo.Record;
import com.csdj.pojo.SysUser;

public interface OralCavityService {
    Record getrecordByid(Integer rid);
    SysUser getUserByid(Integer id);
    int addOralCavity(DKqDescribe dKqDescribe);
    int addrresult(RResult rResult);
}
