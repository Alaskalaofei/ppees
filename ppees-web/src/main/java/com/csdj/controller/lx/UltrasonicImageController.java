package com.csdj.controller.lx;

import com.csdj.pojo.UltrasonicImage;
import com.csdj.ppeesserviceimpl.lx.UltrasonicImageServiceimpl;
import com.csdj.service.lx.RecordService;
import com.csdj.service.lx.UltrasonicImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UltrasonicImageController")
public class UltrasonicImageController {
    @Autowired
    private UltrasonicImageService imageService;

    /**
     * 查询b超
     * @param certificate
     * @return
     */
    @RequestMapping("/ultrasonicImageByrid")
    public UltrasonicImage ultrasonicImageByrid(String certificate)
    {
        return imageService.findgetUltrasonicImageByridBycertificate(certificate);
    }



}
