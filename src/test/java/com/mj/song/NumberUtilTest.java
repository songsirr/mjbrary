package com.mj.song;

import com.mj.song.measurement.LengthConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberUtilTest {

    @Test
    void parseInt() {
        Assertions.assertEquals(1, NumberUtil.parseInt("1"));
        Assertions.assertEquals(0, NumberUtil.parseInt("NON"));
    }

    @Test
    void inchToCm(){
        Assertions.assertEquals(1, LengthConverter.CENTIMETER.toInch(2.54));
    }
}