package com.csdj.service.zxf;

import com.csdj.pojo.RResult;
import com.csdj.pojo.Record;
import com.csdj.pojo.SysUser;

public interface RoutineExaminationService {
    Record getrecordByid(Integer rid);
    SysUser getUserByid(Integer id);
    int addrresult(RResult rResult);
}
