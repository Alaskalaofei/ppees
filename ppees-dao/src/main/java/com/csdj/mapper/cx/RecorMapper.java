package com.csdj.mapper.cx;

import com.csdj.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface RecorMapper {
    /**
     * 档案查询
     * @return
     */
    public List<Record> getlistRecord(@Param("rid")Integer rid,@Param("creationtime1") Date creationtime1,@Param("creationtime2") Date creationtime2,@Param("fname")String fname,@Param("bname")String bname,@Param("fcertificate")String  fcertificate, @Param("fbirth")Date fbirth,@Param("bcertificate")String  bcertificate,@Param("birth") Date birth,@Param("curPageNo")Integer curPageNo, @Param("pageSize")Integer pageSize);

    public  int getLeaveCount(@Param("rid") Integer rid,@Param("creationtime1") Date creationtime1,@Param("creationtime2") Date creationtime2,@Param("fname")String fname,@Param("bname")String bname,@Param("fcertificate")String  fcertificate,@Param("fbirth") Date fbirth,@Param("bcertificate")String  bcertificate,@Param("birth") Date birth);

    Record getid(@Param("rid") Integer rid );

    Integer addHealthCheckup(HealthCheckup healthCheckup);

    List<SysUser> selectAllSysUser();


}
