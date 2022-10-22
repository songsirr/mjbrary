package com.mj.song.date;

enum DateFormatGlobal {

    YMD("yyyy-MM-dd"),
    MDY("MM/dd/yy"),
    DMY("dd/MM/yyyy");

    private final String str;

    DateFormatGlobal(String str){
        this.str = str;
    }

    public String getFormat(){
        return this.str;
    }
}
