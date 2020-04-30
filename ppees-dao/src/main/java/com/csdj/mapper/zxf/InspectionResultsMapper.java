package com.csdj.mapper.zxf;

import com.csdj.pojo.RResult;
import com.csdj.pojo.RResult2;
import com.csdj.pojo.Record;
import com.csdj.pojo.SysUser;

import java.util.List;

public interface InspectionResultsMapper {
    List<RResult> getRResult(String certificate);
    int getRResultCount(String certificate);
    /**
     * 查询患者信息
     * @param rid
     * @return
     */
    Record getrecordByid(Integer rid);

    /**
     * 查询医生信息
     * @param id
     * @return
     */
    SysUser getUserByid(Integer id);
    int addrresult2(RResult2 rResult2);
}
