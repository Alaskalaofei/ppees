package com.csdj.service.zxf;

import com.csdj.pojo.RResult;
import com.csdj.pojo.RResult2;
import com.csdj.pojo.Record;
import com.csdj.pojo.SysUser;

import java.util.List;

public interface InspectionResultsService {
    List<RResult> getRResult(String certificate);
    int getRResultCount(String certificate);
    Record getrecordByid(Integer rid);
    SysUser getUserByid(Integer id);
    int addrresult2(RResult2 rResult2);
}
