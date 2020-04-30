package com.csdj.mapper.zxf;


import com.csdj.pojo.Record;

public interface MedicalCertificateMapper {
    /**
     * 查询患者信息
     * @param rid
     * @return
     */
    Record getrecordByid(Integer rid);

    /**
     * 查询是否检查完成
     * @param certificate
     * @return
     */
    int getrresult2bycertificate(String certificate);
}
