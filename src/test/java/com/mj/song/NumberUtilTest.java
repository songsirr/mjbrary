package com.mj.song;

import com.mj.song.date.DateFormatGlobal;
import com.mj.song.date.DateUtil;
import com.mj.song.measurement.LengthConverter;
import com.mj.song.web.PasswordGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberUtilTest {

    @Test
    void parseInt() {
        Assertions.assertEquals(1, NumberUtil.parseInt("1"));
        Assertions.assertEquals(0, NumberUtil.parseInt("NON"));
    }

    @Test
    void lengthConverter(){
        Assertions.assertEquals(1, LengthConverter.CENTIMETER.toInch(2.54));
    }

    @Test
    void time(){
        System.out.println(DateUtil.datetimeToString(DateFormatGlobal.MDY));
        System.out.println(PasswordGenerator.generate());
    }
}