package com.mj.song.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static boolean isValid(){
        return true;
    }

    public static String dateToString(Date date, DateFormatGlobal dfg){
        if(date == null){
            date = new Date();
        }
        SimpleDateFormat sdf = new SimpleDateFormat(dfg.getFormat());
        return sdf.format(date);
    }

    public static String dateToString(DateFormatGlobal dfg){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(dfg.getFormat());
        return sdf.format(date);
    }

    public static String datetimeToString(Date date, DateFormatGlobal dfg){
        if(date == null){
            date = new Date();
        }
        SimpleDateFormat sdf = new SimpleDateFormat(new StringBuffer(dfg.getFormat()).append(" hh:mm:ss").toString());
        return sdf.format(date);
    }

    public static String datetimeToString(DateFormatGlobal dfg){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(new StringBuffer(dfg.getFormat()).append(" hh:mm:ss").toString());
        return sdf.format(date);
    }
}
