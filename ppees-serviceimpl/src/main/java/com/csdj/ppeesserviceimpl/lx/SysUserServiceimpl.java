package com.csdj.ppeesserviceimpl.lx;

import com.csdj.mapper.lx.SysUserMapper;
import com.csdj.pojo.SysUser;
import com.csdj.service.lx.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceimpl implements SysUserService {

    @Autowired
    private SysUserMapper mapper;

    @Override
    public List<SysUser> findgetuserlist(Integer index, Integer pageSize) {
        return mapper.getuserlist( (index-1)*pageSize, pageSize);
    }

    @Override
    public SysUser findgetuserByid(Integer id) {
        return mapper.getuserByid(id);
    }

    @Override
    public Integer findgetusercount() {
        return mapper.getusercount();
    }

    @Override
    public Integer findaddSysUser(SysUser sysUser) {
        return mapper.addSysUser(sysUser);
    }

    @Override
    public Integer findupdateSysUser(SysUser sysUser) {
        return mapper.updateSysUser(sysUser);
    }

    @Override
    public Integer finddeletesysUser(Integer id) {
        return mapper.deletesysUser(id);
    }
}
