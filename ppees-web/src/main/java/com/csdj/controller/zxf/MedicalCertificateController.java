package com.csdj.controller.zxf;

import com.csdj.pojo.Record;
import com.csdj.service.zxf.MedicalCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

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
    public Object getrecordByid(HttpSession session){
        Record list= (Record) session.getAttribute("Record");
        Record record=service.getrecordByid(list.getRid());
        return record;
    }
    @RequestMapping("getrresult2bycertificate")
    @ResponseBody
    public Object getrresult2bycertificate(String certificate){
        int record=service.getrresult2bycertificate(certificate);
        if (record>0){
            return "true";
        }else{
            return "false";
        }

    }
}
