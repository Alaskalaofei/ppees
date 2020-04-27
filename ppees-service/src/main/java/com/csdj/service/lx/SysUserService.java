package com.csdj.service.lx;

import com.csdj.pojo.SysUser;

import java.util.List;

public interface SysUserService {
    /**
     * 查询所有用户(用户编号,用户姓名)
     * @return
     */
    List<SysUser> findgetuserlist(Integer index, Integer pageSize);

    /**
     * 查询总数
     * @return
     */
    Integer findgetusercount();

    /**
     * 按id查询用户所有信息，配合修改删除用
     * @param id
     * @return
     */
    SysUser findgetuserByid(Integer id);
    /**
     * 新增系统用户
     * @return
     */
    Integer findaddSysUser(SysUser sysUser);

    /**
     * 修改系统用户
     * @param sysUser
     * @return
     */
    Integer findupdateSysUser(SysUser sysUser);

    /**
     * 删除系统用户
     * @param id
     * @return
     */
    Integer finddeletesysUser(Integer id);
}
