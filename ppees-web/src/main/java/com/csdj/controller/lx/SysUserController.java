package com.csdj.controller.lx;

import com.alibaba.fastjson.JSON;
import com.csdj.pojo.SysUser;
import com.csdj.service.lx.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/SysUserController")
public class SysUserController {
    @Autowired
    private SysUserService service;

    @RequestMapping("/userlist")
    @ResponseBody
    public String userlist(Integer index,
                           Integer pageSize){

        if(index==null || index==0){
            index=1;
        }
        /*查询所有用户*/
        List<SysUser> sysUserList=service.findgetuserlist(index,pageSize);
       //*查询所有用户数量*//*
        Integer count=service.findgetusercount();
       Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("data", sysUserList);
        map.put("count", count);
        map.put("msg", "");

        return  JSON.toJSONString(map);
    }

    /**
     * 查询单个用户
     * @param id
     * @return
     */
    @RequestMapping("/userByid")
    @ResponseBody
    public SysUser userByid(Integer id)
    {

        return service.findgetuserByid(id);
    }

    /**
     * 新增
     * @param sysUser
     * @return
     */
    @RequestMapping("/adduser")
    @ResponseBody
    public String adduser(SysUser sysUser){

        sysUser.setCreatedate(new Date());
        Integer count=service.findaddSysUser(sysUser);
        if(count==null || count<=0)
        {
            return "no";
        }
        return "yes";
    }

    /**
     * 修改
     * @param sysUser
     * @return
     */
    @RequestMapping("/updateuser")
    @ResponseBody
    public String updateuser(SysUser sysUser){
        Integer count=service.findupdateSysUser(sysUser);
        if(count==null || count<=0)
        {
            return "no";
        }
        return "yes";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/deleteuser")
    @ResponseBody
    public String deleteuser(Integer id){

        Integer count=service.finddeletesysUser(id);
        if(count==null || count<=0)
        {
            return "no";
        }
        return "yes";
    }
}
