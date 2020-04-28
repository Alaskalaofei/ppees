package com.csdj.mapper.lx;

import com.csdj.pojo.UltrasonicImage;
import com.csdj.pojo.VaccineTypeb;

public interface UltrasonicImageMapper {
    /**
     * 按rid(档案id)
     * @param certificate
     * @return
     */
    UltrasonicImage getUltrasonicImageByridBycertificate(String certificate);

   /* *//**
     * 修改B超信息
     * @param ultrasonicImage
     * @return
     *//*
    Integer updateUltrasonicImage(UltrasonicImage ultrasonicImage);*/
}
