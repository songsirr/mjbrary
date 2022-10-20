package com.mj.song.measurement;

public enum LengthConverter {

    MILLIMETER (LengthConverter.MILLIMETER_SCALE),
    CENTIMETER (LengthConverter.CENTIMETER_SCALE),
    METER (LengthConverter.METER_SCALE),
    KILOMETER (LengthConverter.KILOMETER_SCALE),
    INCH (LengthConverter.INCH_SCALE),
    FEET (LengthConverter.FEET_SCALE),
    YARD (LengthConverter.YARD_SCALE),
    MILE (LengthConverter.MILE_SCALE);

    private final static double CENTIMETER_SCALE = 1;
    private final static double MILLIMETER_SCALE = CENTIMETER_SCALE/10;
    private final static double METER_SCALE = CENTIMETER_SCALE*100;
    private final static double KILOMETER_SCALE = METER_SCALE*1000;
    private final static double INCH_SCALE = CENTIMETER_SCALE*2.54;
    private final static double FEET_SCALE = INCH_SCALE*12;
    private final static double YARD_SCALE = FEET_SCALE*36;
    private final static double MILE_SCALE = YARD_SCALE*1760;

    private final double scale;

    LengthConverter(double v){
        this.scale = v;
    }

    public double toMillimeter(double target){
        return calc(target, MILLIMETER_SCALE);
    }

    public double toCentimeter(double target){
        return calc(target, CENTIMETER_SCALE);
    }

    public double toMeter(double target){
        return calc(target, METER_SCALE);
    }

    public double toKilometer(double target){
        return calc(target, KILOMETER_SCALE);
    }

    public double toInch(double target){
        return calc(target, INCH_SCALE);
    }

    public double toFeet(double target){
        return calc(target, FEET_SCALE);
    }

    public double toYard(double target){
        return calc(target, YARD_SCALE);
    }

    public double toMile(double target){
        return calc(target, MILE_SCALE);
    }

    private double calc(double target, double scale){
        return Math.round(((this.scale*target)/scale)*1000000)/1000000.0;
    }
}
