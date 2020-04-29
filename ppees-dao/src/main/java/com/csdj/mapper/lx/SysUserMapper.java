package com.csdj.mapper.lx;

import com.csdj.pojo.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserMapper {
    /**
     * 登录
     * @param userName
     * @return
     */
    SysUser getsysuserlogin(String userName);
    /**
     * 查询所有用户(用户编号,用户姓名)
     * @return
     */
    List<SysUser> getuserlist(@Param("index") Integer index,@Param("pageSize") Integer pageSize);

    /**
     * 查询总数
     * @return
     */
    Integer getusercount();

    /**
     * 按id查询用户所有信息，配合修改删除用
     * @param id
     * @return
     */
    SysUser getuserByid(Integer id);

    /**
     * 新增系统用户
     * @return
     */
    Integer addSysUser(SysUser sysUser);

    /**
     * 修改系统用户
     * @param sysUser
     * @return
     */
    Integer updateSysUser(SysUser sysUser);

    /**
     * 删除系统用户
     * @param id
     * @return
     */
    Integer deletesysUser(Integer id);

}
