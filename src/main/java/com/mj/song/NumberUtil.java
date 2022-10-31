package com.mj.song;

public class NumberUtil {

    private String type;

    private String from;

    private String to;

    private double value;

    public NumberUtil(){};

    public NumberUtil(String from){
        this.from = from;
        System.out.println("from " + from);
    }

    public NumberUtil(String from, String to){
        this.from = from;
        this.to = to;
        System.out.println("from " + from + " to " + to);
    }

    public double convert(double value){
        System.out.println("from " + this.from + " to " + this.to + " value " + value);
        return 0;
    }

    public static class Length {

        private String type;

        private String from;

        private String to;

        private double value;

        public Length(){

        }

        public Length(String from){
            this.from = from;
        }

//        public Length from(String from){
//            this.from = from;
//            return this;
//        }

        public NumberUtil to(String to){
            return new NumberUtil(this.from, to);
        }

        /*
        public Length value(double value){
            this.value = value;
            return this;
        }

        public double convert(){
            return 0;
        }
        */
    }

    public enum Leng{
        ONE("A", 123),
        TWO("B", 234);

        private String string;
        private int number;

        Leng(String string, int number){
            this.string = string;
            this.number = number;
        }

        Leng(){}

        public Length from(String from){
            return new Length(from);
        }
    }
}
