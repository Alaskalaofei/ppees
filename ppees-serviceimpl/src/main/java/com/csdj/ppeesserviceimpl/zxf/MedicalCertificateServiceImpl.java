package com.csdj.ppeesserviceimpl.zxf;

import com.csdj.mapper.zxf.MedicalCertificateMapper;
import com.csdj.pojo.Record;
import com.csdj.service.zxf.MedicalCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalCertificateServiceImpl implements MedicalCertificateService {
    @Autowired
    private MedicalCertificateMapper mapper;
    @Override
    public Record getrecordByid(Integer rid) {
        return mapper.getrecordByid(rid);
    }
}
