package com.mj.song;

import com.mj.song.string.StringUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StringUtilTest {

    private String[] strings = {null, "", "  ", "   ", "" +
            "", "asd", "asd asd"};

    @Test
    void isNullOrEmpty(){
        Assertions.assertTrue(StringUtil.isNullOrEmpty(strings[0]));
        Assertions.assertTrue(StringUtil.isNullOrEmpty(strings[1]));
        Assertions.assertFalse(StringUtil.isNullOrEmpty(strings[2]));
        Assertions.assertFalse(StringUtil.isNullOrEmpty(strings[3]));
        Assertions.assertTrue(StringUtil.isNullOrEmpty(strings[4]));
        Assertions.assertFalse(StringUtil.isNullOrEmpty(strings[5]));
        Assertions.assertFalse(StringUtil.isNullOrEmpty(strings[6]));
    }

    @Test
    void isNullOrBlank(){
        Assertions.assertTrue(StringUtil.isNullOrBlank(strings[0]));
        Assertions.assertTrue(StringUtil.isNullOrBlank(strings[1]));
        Assertions.assertTrue(StringUtil.isNullOrBlank(strings[2]));
        Assertions.assertTrue(StringUtil.isNullOrBlank(strings[3]));
        Assertions.assertTrue(StringUtil.isNullOrBlank(strings[4]));
        Assertions.assertFalse(StringUtil.isNullOrBlank(strings[5]));
        Assertions.assertFalse(StringUtil.isNullOrBlank(strings[6]));
    }
}
