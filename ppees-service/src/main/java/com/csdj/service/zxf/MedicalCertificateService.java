package com.csdj.service.zxf;

import com.csdj.pojo.Record;

public interface MedicalCertificateService {
    Record getrecordByid(Integer rid);
    int getrresult2bycertificate(String certificate);
}
