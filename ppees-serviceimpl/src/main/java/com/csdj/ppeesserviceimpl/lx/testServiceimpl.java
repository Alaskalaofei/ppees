package com.csdj.ppeesserviceimpl.lx;

import com.csdj.mapper.lx.TypeMapper2;
import com.csdj.pojo.housetype;
import com.csdj.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class testServiceimpl implements testService {

    @Autowired
    private TypeMapper2 mapper;

    @Override
    public List<housetype> gettest() {
        return mapper.getlist();
    }
}

