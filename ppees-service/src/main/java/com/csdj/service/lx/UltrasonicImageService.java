package com.csdj.service.lx;

import com.csdj.pojo.UltrasonicImage;
import com.csdj.pojo.VaccineTypeb;

public interface UltrasonicImageService {
    /**
     * 按rid(档案id)
     * @param certificate
     * @return
     */
    UltrasonicImage findgetUltrasonicImageByridBycertificate(String certificate);

    /* *//**
     * 修改B超信息
     * @param ultrasonicImage
     * @return
     *//*
    Integer updateUltrasonicImage(UltrasonicImage ultrasonicImage);*/
}
