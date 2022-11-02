package com.mj.song.measurement;

/**
 * TESTING..
 */
public enum MEASUREMENT {

    LENGTH,
    SQUARE;

    public From from(String from){
        return new From(from);
    }

    public class From{
        private String from;
        From(String from){
            this.from = from;
        }
        public To to(String to){
            return new To(this.from, to);
        }

        public class To{
            private String from;
            private String to;
            To(String from, String to){
                this.from = from;
                this.to = to;
            }

            public double convert(double value){
                double a = com.mj.song.measurement.LENGTH.getByKey(this.from).getScale(); //1
                double b = com.mj.song.measurement.LENGTH.getByKey(this.to).getScale(); //10
                double r = Math.round(((a*value)/b)*1000000)/1000000.0;
                return r;
            }
        }
    }

    public double convert(MEASUREMENT measurement, double value){
        switch (MEASUREMENT.valueOf(measurement.name())){
            case LENGTH: break;
            case SQUARE: break;
        }
        return 0;
    }
}
