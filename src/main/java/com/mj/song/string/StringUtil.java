package com.mj.song.string;

public class StringUtil {

    public StringUtil(){}

    public static boolean isNullOrEmpty(String str){
        return str == null || str.length() == 0;
    }

    public static boolean isNullOrBlank(String str){
        return str == null || str.chars().allMatch(Character::isWhitespace);
    }
}
