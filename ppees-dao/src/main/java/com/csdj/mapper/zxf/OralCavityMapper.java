package com.csdj.mapper.zxf;

import com.csdj.pojo.DKqDescribe;
import com.csdj.pojo.RResult;
import com.csdj.pojo.Record;
import com.csdj.pojo.SysUser;

public interface OralCavityMapper {
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
     * 新增口腔检查
     * @param dKqDescribe
     * @return
     */
    int addOralCavity(DKqDescribe dKqDescribe);

    /**
     * 新增检查结果
     * @param rResult
     * @return
     */
    int addrresult(RResult rResult);
}
