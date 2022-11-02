package com.mj.song.number;

import java.text.NumberFormat;

public class NumberUtil {

    public static String formatCommas(Number n){
        NumberFormat numberFormat = NumberFormat.getInstance();
        String str = numberFormat.format(n);
        return str;
    }
}
