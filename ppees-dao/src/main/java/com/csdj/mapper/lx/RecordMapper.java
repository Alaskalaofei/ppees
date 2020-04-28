package com.csdj.mapper.lx;

import com.csdj.pojo.Record;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface RecordMapper {
    /**
     * 查询,或条件查询
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
    List<Record> getRecordByRecord(@Param("creationtime") String creationtime,
                                   @Param("fcertificate")String fcertificate,
                                   @Param("fname") String fname,
                                   @Param("bcertificate") String bcertificate,
                                   @Param("bname") String bname,
                                   @Param("fbirth") String fbirth,
                                   @Param("birth") String birth,
                                   @Param("rid") Integer rid,
                                   @Param("index")Integer index,
                                   @Param("pageSize")Integer pageSize);

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
    Integer getRecordByRecordCount(@Param("creationtime") String creationtime,
                                   @Param("fcertificate")String fcertificate,
                                   @Param("fname") String fname,
                                   @Param("bcertificate") String bcertificate,
                                   @Param("bname") String bname,
                                   @Param("fbirth") String fbirth,
                                   @Param("birth") String birth,
                                   @Param("rid") Integer rid);

    /**
     * 按id查询Record
     * @param rid
     * @return
     */
        Record getRecordByRid(Integer rid);
}
