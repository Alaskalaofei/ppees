package com.csdj.service.lx;

import com.csdj.pojo.Record;

import java.util.Date;
import java.util.List;

public interface RecordService {
    /**
     * 档案信息查询
     * @param creationtime
     * @param fcertificate
     * @param fname
     * @param bcertificate
     * @param bname
     * @param fbirth
     * @param birth
     * @param rid
     * @param index
     * @param pageSize
     * @return
     */
    List<Record> findgetRecordByRecord(String creationtime,
                                       String fcertificate,
                                       String fname,
                                       String bcertificate,
                                       String bname,
                                       String fbirth,
                                       String birth,
                                       Integer rid,
                                       Integer index,Integer pageSize);

    /**
     * 查询总数,或条件查询总数
     * @param creationtime
     * @param fcertificate
     * @param fname
     * @param bcertificate
     * @param bname
     * @param fbirth
     * @param birth
     * @param rid
     * @return
     */
    Integer findgetRecordByRecordCount(String creationtime,
                                       String fcertificate,
                                       String fname,
                                       String bcertificate,
                                       String bname,
                                       String fbirth,
                                       String birth,
                                       Integer rid);
    /**
     * 按id查询Record
     * @param rid
     * @return
     */
    Record findgetRecordByRid(Integer rid);
}
