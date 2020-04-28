package com.csdj.mapper.lx;

import com.csdj.pojo.FollowUpVisit;
import com.csdj.pojo.Record;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface FollowUpVisitMapper {
    /**
     * 查询已发信息
     * @param creationtime1
     * @param creationtime2
     * @return
     */
        List<FollowUpVisit> getFollowUpVisitBydate(@Param("creationtime1") String creationtime1, @Param("creationtime2") String creationtime2,@Param("index") Integer index,@Param("pageSize") Integer pageSize);

    /**
     * 查询已发信息总数
     * @param creationtime1
     * @param creationtime2
     * @return
     */
        Integer getFollowUpVisitBydateByCoutn(@Param("creationtime1") String creationtime1, @Param("creationtime2") String creationtime2);

    /**
     * 查询女方档案信息，用于发送短信
     * @param fname
     * @param fcertificate
     * @param creationtime1
     * @param creationtime2
     * @return
     */
        List<Record> getFRecordByRecord(@Param("fname")String fname,@Param("fcertificate") String fcertificate,@Param("creationtime1") String creationtime1, @Param("creationtime2") String creationtime2,@Param("index") Integer index,@Param("pageSize") Integer pageSize);

    /**
     * 查询女方档案信息总数
     * @param fname
     * @param fcertificate
     * @param creationtime1
     * @param creationtime2
     * @return
     */
        Integer getFRecordByRecordByCount(@Param("fname")String fname,@Param("fcertificate") String fcertificate,@Param("creationtime1") String creationtime1, @Param("creationtime2") String creationtime2);
    /**
     * 添加已发短信内容
     * @param followUpVisitList
     * @return
     */
        Integer addFollowUpVisit(List<FollowUpVisit> followUpVisitList);

}
