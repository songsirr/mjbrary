package com.mj.song;

import com.mj.song.date.DateFormatGlobal;
import com.mj.song.date.DateUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

class DateUtilTest {

    private Date date = new Date();
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Test
    void dateToString_with_date(){
        Assertions.assertEquals("", DateUtil.dateToString(DateFormatGlobal.YMD));
    }

    @Test
    void dateToString_current_time(){
        DateUtil.dateToString(date, DateFormatGlobal.YMD);
    }

    @Test
    void datetimeToString_with_date(){
        DateUtil.datetimeToString(DateFormatGlobal.YMD);
    }

    @Test
    void datetimeToString_with_current_time(){
        DateUtil.datetimeToString(date, DateFormatGlobal.YMD);
    }
}
