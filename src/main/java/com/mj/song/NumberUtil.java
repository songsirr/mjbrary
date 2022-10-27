package com.mj.song;

import com.mj.song.global.GlobalMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NumberUtil {

    public static int parseInt(String args) {
        int number;
        try{
            number = Integer.parseInt(args);
        } catch (NumberFormatException e){
            number = 0;
        }

        String sdf = "asd";
        sdf.substring(1);

        return number;
    }
}
