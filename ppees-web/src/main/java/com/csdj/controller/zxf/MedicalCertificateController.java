package com.csdj.controller.zxf;

import com.csdj.pojo.Record;
import com.csdj.service.zxf.MedicalCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("MedicalCertificate")
public class MedicalCertificateController {
    @Autowired
    private MedicalCertificateService service;

    /**
     * 男医学证明跳转
     * @return
     */
    @RequestMapping("goInspectioncertificatem")
    public String goInspectioncertificate(){
        return "Inspectioncertificatem";
    }
    /**
     * 女医学证明跳转
     * @return
     */
    @RequestMapping("goInspectioncertificatef")
    public String goInspectioncertificatef(){
        return "Inspectioncertificatef";
    }
    @RequestMapping("getrecordByid")
    @ResponseBody
    public Object getrecordByid(){
        Integer rid=1;
        Record record=service.getrecordByid(rid);
        return record;
    }
}
