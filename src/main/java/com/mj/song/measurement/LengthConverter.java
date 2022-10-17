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

    private final static double MILLIMETER_SCALE = 1;
    private final static double CENTIMETER_SCALE = 10;
    private final static double METER_SCALE = 1000;
    private final static double KILOMETER_SCALE = 1000000;
    private final static double INCH_SCALE = 25.4;
    private final static double FEET_SCALE = 304.8;
    private final static double YARD_SCALE = 914.4;
    private final static double MILE_SCALE = 1609340;

    private final double scale;

    LengthConverter(double v){
        this.scale = v;
    }

    public double toMillimeter(double target){
        return this.scale/target;
    }

    public double toCentimeter(double target){
        return calc(LengthConverter.CENTIMETER.scale, target);
    }

    public double toMeter(double target){
        return calc(LengthConverter.METER.scale, target);
    }

    public double toKilometer(double target){
        return calc(LengthConverter.KILOMETER.scale, target);
    }

    public double toInch(double target){
        return calc(LengthConverter.INCH.scale, target);
    }

    public double toFeet(double target){
        return calc(LengthConverter.FEET.scale, target);
    }

    public double toYard(double target){
        return calc(LengthConverter.YARD.scale, target);
    }

    public double toMile(double target){
        return calc(LengthConverter.MILE.scale, target);
    }

    private double calc(double scale, double target){
        return (this.scale/scale) * target;
    }
}
