package com.mj.song;

import com.mj.song.number.NumberUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberUtilTest2 {

    @Test
    void formatCommas(){
        Assertions.assertEquals("123,000", NumberUtil.formatCommas(123000));
        Assertions.assertEquals("123,000.001", NumberUtil.formatCommas(123000.001));
        Assertions.assertEquals("123", NumberUtil.formatCommas(123));
        Assertions.assertEquals("0.003", NumberUtil.formatCommas(0.003));
    }
}
