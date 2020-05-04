package com.csdj.mapper.lx;

import com.csdj.pojo.smstemplate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmsTemplateMapper {
    /**
     * 查询所有短信模板数据，分页，按条件
     * @param smstemplatecontent
     * @param index
     * @param pageSize
     * @return
     */
    List<smstemplate> getsmstemplate(@Param("smstemplatecontent") String smstemplatecontent,
                                     @Param("index")Integer index,
                                     @Param("pageSize")Integer pageSize);

    /**
     * 查询总数
     * @param smstemplatecontent
     * @return
     */
    Integer getsmstemplatecount(String smstemplatecontent);
    /**
     * 查询短信模板是否存在
     * @param smstemplatecontent
     * @return
     */
    smstemplate getsmstemplateBysmstemplatecontent(String smstemplatecontent);
    /**
     * 新增短信模板内容
     * @param smstemplate
     * @return
     */
    Integer addsmstemplate(smstemplate smstemplate);
}
