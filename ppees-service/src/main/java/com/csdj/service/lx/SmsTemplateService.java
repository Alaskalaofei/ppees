package com.csdj.service.lx;

import com.csdj.pojo.smstemplate;

import java.util.List;

public interface SmsTemplateService {
    /**
     * 查询所有短信模板数据，分页，按条件
     * @param smstemplatecontent
     * @param index
     * @param pageSize
     * @return
     */
    List<smstemplate> findsmstemplate(String smstemplatecontent, Integer index, Integer pageSize);
    /**
     * 查询总数
     * @param smstemplatecontent
     * @return
     */
    Integer findsmstemplatecount(String smstemplatecontent);
    /**
     * 查询短信模板是否存在
     * @param smstemplatecontent
     * @return
     */
    smstemplate findsmstemplateBysmstemplatecontent(String smstemplatecontent);
    /**
     * 新增短信模板内容
     * @param smstemplate
     * @return
     */
    Integer findaddsmstemplate(smstemplate smstemplate);
}
