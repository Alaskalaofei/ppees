package com.csdj.service.lx;

import com.csdj.pojo.FollowUpVisit;
import com.csdj.pojo.Record;

import java.util.Date;
import java.util.List;

public interface FollowUpVisitService {
    /**
     * 查询已发信息
     * @param creationtime1
     * @param creationtime2
     * @return
     */
    List<FollowUpVisit> findgetFollowUpVisitBydate(String creationtime1,String creationtime2,Integer index,Integer pageSize);
    /**
     * 查询已发信息总数
     * @param creationtime1
     * @param creationtime2
     * @return
     */
    Integer getFollowUpVisitBydateByCoutn(String creationtime1,String creationtime2);

    /**
     * 查询女方档案信息，用于发送短信
     * @param fname
     * @param fcertificate
     * @param creationtime1
     * @param creationtime2
     * @return
     */
    List<Record> findgetFRecordByRecord(String fname, String fcertificate,String creationtime1,String creationtime2,Integer index,Integer pageSize);
    /**
     * 查询女方档案信息总数
     * @param fname
     * @param fcertificate
     * @param creationtime1
     * @param creationtime2
     * @return
     */
    Integer getFRecordByRecordByCount(String fname, String fcertificate,String creationtime1,String creationtime2);

    /**
     * 添加已发短信内容
     * @param followUpVisitList
     * @return
     */
    Integer findaddFollowUpVisit(List<FollowUpVisit> followUpVisitList);
}
