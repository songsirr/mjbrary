package com.mj.song;

import com.mj.song.date.DateUtil;
import com.mj.song.measurement.LengthConverter;
import com.mj.song.object.ObjectUtil;
import com.mj.song.web.PasswordGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class NumberUtilTest {

    @Test
    void parseInt() {
        Assertions.assertEquals(1, NumberUtil.parseInt("1"));
        Assertions.assertEquals(0, NumberUtil.parseInt("NON"));
    }

    @Test
    void lengthConverter(){
        Assertions.assertEquals(1, LengthConverter.CENTIMETER.toInch(2.54));
    }

    @Test
    void time(){
        int t = 8;
        int[] s = {0, 0};
        int[] e = {0, 7};
        int[][] pattern = {{1,2}, {2,1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}, {-2, 1}, {-1, 2}};
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(s[0], s[1]));
        while (!q.isEmpty()){
            Pair p = q.poll();

            p.toString();

            if(p.x == e[0] && p.y == e[1]){
                System.out.println(p.cnt);
                return;
            }

            for(int i = 0; i < pattern.length; i++){
                int a = p.x + pattern[i][0];
                int b = p.x + pattern[i][1];
                int c = p.cnt + 1;

                if (p.x < 0 || p.x >= t || p.y < 0 || p.y >= t){

                } else {
                    q.add(new Pair(a, b, c));
                }
            }
        }
    }

    @Test
    void objectUtilTest(){
//        TestClass t = new TestClass("f", "s", "t");
//        TestClass t = new TestClass("f", "s", "");
//        TestClass t = new TestClass("z", "f", "s", "t");
        TestClass t = new TestClass("", "f", "s", "t");
//        TestClass t = new TestClass("z", "f", "s", "");

        ObjectUtil.removeEmptyFields(t);

        Assertions.assertNull(t.zero);
        Assertions.assertEquals("f", t.first);
        Assertions.assertEquals("s", t.second);
        Assertions.assertEquals("t", t.third);
    }

    class SuperTestClass {
        String zero;
    }

    class TestClass extends SuperTestClass {
        String first;
        String second;
        String third;

        public TestClass(String first, String second, String third){
            this.first = first;
            this.second = second;
            this.third = third;
        }

        public TestClass(String zero, String first, String second, String third){
            super.zero = zero;
            this.first = first;
            this.second = second;
            this.third = third;
        }

        @Override
        public String toString() {
            return "Z : " + zero + "/ F : " + first + "/ S : " + second + "/ T : " + third;
        }
    }

    class Pair{
        int x;
        int y;
        int cnt;

        public Pair(int x, int y){
            this.x = x;
            this.y = y;
            this.cnt = 0;
        }

        public Pair(int x, int y, int cnt){
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }

        public void move(int[] arr){
            this.x += arr[0];
            this.y += arr[1];
        }

        @Override
        public String toString() {
            return "x = " + this.x + " || y = " + this.y + " || cnt = " + this.cnt;
        }
    }
}