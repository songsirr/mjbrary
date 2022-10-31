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
                System.out.println("from " + this.from + " to " + this.to + " value " + value);
                return 0;
            }
        }
    }
}
