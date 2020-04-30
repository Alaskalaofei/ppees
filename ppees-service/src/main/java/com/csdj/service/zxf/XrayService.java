package com.csdj.service.zxf;

import com.csdj.pojo.RResult;
import com.csdj.pojo.Record;
import com.csdj.pojo.SysUser;
import com.csdj.pojo.XRayExamineResult;

public interface XrayService {
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


    /**
     * 新增检查结果
     * @param rResult
     * @return
     */
    int addrresult(RResult rResult);

    int addXrayexamine(XRayExamineResult result);
}
