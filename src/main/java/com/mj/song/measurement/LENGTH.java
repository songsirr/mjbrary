package com.mj.song.measurement;

import java.util.Arrays;

public enum LENGTH {

    MILLIMETER ("mm", LENGTH.MILLIMETER_SCALE),
    CENTIMETER ("cm", LENGTH.CENTIMETER_SCALE),
    METER ("m", LENGTH.METER_SCALE),
    KILOMETER ("km", LENGTH.KILOMETER_SCALE),
    INCH ("in", LENGTH.INCH_SCALE),
    FEET ("ft", LENGTH.FEET_SCALE),
    YARD ("yd", LENGTH.YARD_SCALE),
    MILE ("mi", LENGTH.MILE_SCALE);

    private final static double CENTIMETER_SCALE = 1;
    private final static double MILLIMETER_SCALE = CENTIMETER_SCALE/10;
    private final static double METER_SCALE = CENTIMETER_SCALE*100;
    private final static double KILOMETER_SCALE = METER_SCALE*1000;
    private final static double INCH_SCALE = CENTIMETER_SCALE*2.54;
    private final static double FEET_SCALE = INCH_SCALE*12;
    private final static double YARD_SCALE = FEET_SCALE*36;
    private final static double MILE_SCALE = YARD_SCALE*1760;

    private final String key;
    private final double scale;

    LENGTH(String key, double scale){
        this.key = key;
        this.scale = scale;
    }

    public double getScale() {
        return this.scale;
    }

    public static LENGTH getByKey(String key){
        return Arrays.stream(values())
                .filter(bl -> bl.key.equalsIgnoreCase(key))
                .findFirst()
                .orElse(null);
    }
}
