package com.csdj.ppeesserviceimpl.lx;

import com.csdj.mapper.lx.SmsTemplateMapper;
import com.csdj.pojo.smstemplate;
import com.csdj.service.lx.SmsTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SmsTemplateServiceimpl implements SmsTemplateService {
    @Autowired
    private SmsTemplateMapper mapper;



    @Override
    public List<smstemplate> findsmstemplate(String smstemplatecontent, Integer index, Integer pageSize) {
        return mapper.getsmstemplate(smstemplatecontent,(index-1)*pageSize, pageSize);
    }

    @Override
    public Integer findsmstemplatecount(String smstemplatecontent) {
        return mapper.getsmstemplatecount(smstemplatecontent);
    }

    @Override
    public smstemplate findsmstemplateBysmstemplatecontent(String smstemplatecontent) {
        return mapper.getsmstemplateBysmstemplatecontent(smstemplatecontent);
    }

    @Override
    public Integer findaddsmstemplate(smstemplate smstemplate) {
        return mapper.addsmstemplate(smstemplate);
    }
}
