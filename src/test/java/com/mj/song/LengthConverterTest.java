package com.mj.song;

import com.mj.song.measurement.LengthConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LengthConverterTest {

    @Test
    void centimeterAndMillimeter(){
        Assertions.assertEquals(10, LengthConverter.CENTIMETER.toMillimeter(1));
        Assertions.assertEquals(0.1, LengthConverter.MILLIMETER.toCentimeter(1));
    }

    @Test
    void centimeterAndMeter(){
        Assertions.assertEquals(0.01, LengthConverter.CENTIMETER.toMeter(1));
        Assertions.assertEquals(100, LengthConverter.METER.toCentimeter(1));
    }

    @Test
    void centimeterAndKilometer(){
        Assertions.assertEquals(0.00001, LengthConverter.CENTIMETER.toKilometer(1));
        Assertions.assertEquals(100000, LengthConverter.KILOMETER.toCentimeter(1));
    }
}
