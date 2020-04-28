package com.csdj.ppeesserviceimpl.lx;

import com.csdj.mapper.lx.UltrasonicImageMapper;
import com.csdj.pojo.UltrasonicImage;
import com.csdj.pojo.VaccineTypeb;
import com.csdj.service.lx.UltrasonicImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UltrasonicImageServiceimpl implements UltrasonicImageService {

    @Autowired
    private UltrasonicImageMapper mapper;

    /**
     * 查询b超
     * @param certificate
     * @return
     */
    @Override
    public UltrasonicImage findgetUltrasonicImageByridBycertificate(String certificate) {
        return mapper.getUltrasonicImageByridBycertificate(certificate);
    }
}
