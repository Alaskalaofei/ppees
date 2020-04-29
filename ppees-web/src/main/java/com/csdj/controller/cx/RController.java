package com.csdj.controller.cx;

import com.alibaba.fastjson.JSON;
import com.csdj.pojo.*;
import com.csdj.service.cx.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.lang.model.type.IntersectionType;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


@Controller
@RequestMapping("cxRecord")
public class RController {

    @Autowired
    private RecordService service;

    /**
     *跳转查询页面
     * @param
     * @return
     */
    @RequestMapping("/getRecord")
    public String getRecord()
    {
        return "page";
    }

    @RequestMapping("/pageFR")
    public String pageFR(){
        return "record";
    }

    /**
     *跳转新增页面
     * @param
     * @return
     */
    @RequestMapping("/addRecord")
    public String addRecord()
    {
        return "kjian";
    }


    /**
     * 查询
     * @param rid
     * @param creationtime1
     * @param creationtime2
     * @param fname
     * @param bname
     * @param fcertificate
     * @param fbirth
     * @param bcertificate
     * @param birth
     * @param page
     * @param limit
     * @param model
     * @return
     */
    @RequestMapping("page")
    @ResponseBody
    public String page(Integer rid, @DateTimeFormat(pattern="yyyy-MM-dd")Date creationtime1, @DateTimeFormat(pattern="yyyy-MM-dd")Date creationtime2, String fname, String bname, String  fcertificate, @DateTimeFormat(pattern="yyyy-MM-dd")Date fbirth, String  bcertificate,@DateTimeFormat(pattern="yyyy-MM-dd") Date birth, Integer page, Integer limit, Model model){

        model.addAttribute("code",0);
        model.addAttribute("msg", "");
        model.addAttribute("count", service.getLeaveCount(rid,creationtime1,creationtime2,fname,bname,fcertificate,fbirth,bcertificate,birth));
        model.addAttribute("data", service.getlistRecord(rid,creationtime1,creationtime2,fname,bname,fcertificate,fbirth,bcertificate,birth,page,limit));
        return JSON.toJSONString(model);
    }

    /**
     * 根据id查询信息
     * @param rid
     * @param session
     * @return
     */
    @RequestMapping("deleteByid")
    @ResponseBody
    public String deleteByid(Integer rid, HttpSession  session){
        Record list=service.getid(rid);
        List<VaccineTypeb> Vlist=service.selectAllVaccineTypeb();
        List<DiseaseType> dlist=service. selectDiseaseType();
        List<DiseaseType> flist=service. selectDiseaseTypenv();
        List<DiseaseType> Alist=service. selectDiseaseTypeA();
        List<IntelligenceTypeb> Ilista=service. selectIntelligenceTypeb();
        session.setAttribute("Vlist",Vlist);
        session.setAttribute("Record", list);
        session.setAttribute("dlist", dlist);
        session.setAttribute("flist", flist);
        session.setAttribute("Alist", Alist);
        session.setAttribute("Ilista", Ilista);
        return  "null";
    }

    /**
     * 页面跳转
     * @param session
     * @return
     */
    @RequestMapping("getnanHealth")
    public String getnanHealth(HttpSession session){
        Record list= (Record) session.getAttribute("Record");
        return  "nanHealth";
    }

    @RequestMapping("getnvHealth")
    public String getnvHealth(HttpSession session){
        Record list= (Record) session.getAttribute("Record");
        return  "nvHealth";
    }

    /**
     *  查询医生名字
     * @return
     */
    @RequestMapping(value="/findRole",produces= {"application/json;charset=utf-8"})
    @ResponseBody
    public String findRole() {
        return JSON.toJSONString(service.selectAllSysUser());
    }

    @RequestMapping(value="/findConsent",produces= {"application/json;charset=utf-8"})
    @ResponseBody
    public String findConsent() {
        return JSON.toJSONString(service.selectAllconsent());
    }

    @RequestMapping(value="/findDucation",produces= {"application/json;charset=utf-8"})
    @ResponseBody
    public String findDucation() {
        return JSON.toJSONString(service.selectAlleducation());
    }

    /**
     * 身份证类型
     * @return
     */
    @RequestMapping(value="/findDocument",produces= {"application/json;charset=utf-8"})
    @ResponseBody
    public String findDocument() {
        return JSON.toJSONString(service.selectAlldocument());
    }

    /**
     * 新增
     * @param healthCheckup
     * @param session
     * @return
     */
    @RequestMapping(value="/add",produces= {"application/json;charset=utf-8"})
    @ResponseBody
    public  String add(HealthCheckup healthCheckup,Intelligence intelligence,HttpSession session){
        List<IntelligenceTypeb>  listx= (List<IntelligenceTypeb>) session.getAttribute("Ilista");
        Record list= (Record) session.getAttribute("Record");
        healthCheckup.setCertificate(list.getBcertificate());
        Iterator<IntelligenceTypeb> it = listx.iterator();
        intelligence.setIntelligencetype(1);
        intelligence.setCertificate(list.getBcertificate());
        service.addHealthCheckup(healthCheckup);
        return "nanHealth";
    }


    @RequestMapping(value="/addRecordA",produces= {"application/json;charset=utf-8"})
    @ResponseBody
    public  String addRecordA(Record record,HttpSession session){

        service.addRecord(record);

        return "kjian";
    }


    /**
     * 页面跳转
     * @param session
     * @return
     */
    @RequestMapping("getnanGeneral")
    public String getnanGeneral(HttpSession session){
        Record list= (Record) session.getAttribute("Record");

        return  "nanGeneral";
    }


    /**
     * 页面跳转
     * @param session
     * @return
     */
    @RequestMapping("getnvGeneral")
    public String getnvGeneral(HttpSession session){
        Record list= (Record) session.getAttribute("Record");
        return  "nvGeneral";
    }


    @RequestMapping(value="/addGGeneral",produces= {"application/json;charset=utf-8"})
    @ResponseBody
    public  String addGGeneral(GGeneral gGeneral, HttpSession session){
        Record list= (Record) session.getAttribute("Record");
        gGeneral.setCertificate(list.getBcertificate());
        service.addGGeneral(gGeneral);
        return "nanGeneral";
    }

    @RequestMapping(value="/findVaccineTypeb",produces= {"application/json;charset=utf-8"})
    public  Object findVaccineTypeb(VaccineTypeb vaccineTypeb, HttpSession session,Model model){
       List<VaccineTypeb>  list= (List<VaccineTypeb>) session.getAttribute("Vlist");
        List<DiseaseType>  listd= (List<DiseaseType>) session.getAttribute("dlist");
        List<DiseaseType>  listf= (List<DiseaseType>) session.getAttribute("flist");
        List<DiseaseType>  lista= (List<DiseaseType>) session.getAttribute("Alist");
        return null;
    }


    @RequestMapping("pageF")
    @ResponseBody
    public String pageF(String fname, String fphone, Integer page, Integer limit, Model model){
        model.addAttribute("code",0);
        model.addAttribute("msg", "");
        model.addAttribute("count", service.getCount(fname,fphone));
        model.addAttribute("data", service.selectF(fname,fphone,page,limit));
        return JSON.toJSONString(model);
    }


}
