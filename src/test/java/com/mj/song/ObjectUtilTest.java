package com.mj.song;

import com.mj.song.object.ObjectUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class ObjectUtilTest {

    @Test
    void removeEmptyFields(){
//        TestClass t = new TestClass("f", "s", "t");
//        TestClass t = new TestClass("f", "s", "");
//        TestClass t = new TestClass("z", "f", "s", "t");
        ObjectUtilTest.TestClass t = new ObjectUtilTest.TestClass("", "f", "s", "t");
//        TestClass t = new TestClass("z", "f", "s", "");

        ObjectUtil.removeEmptyFields(t);

        Assertions.assertNull(t.zero);
        Assertions.assertEquals("f", t.first);
        Assertions.assertEquals("s", t.second);
        Assertions.assertEquals("t", t.third);
    }

    @Test
    void mapToObjectTest(){
        Map<String, String> map = new HashMap<>();
        map.put("first", "ff");
        map.put("second", "ss");
        map.put("third", "tt");
        TestClass tc = new TestClass();
        tc = (TestClass)ObjectUtil.mapToObject(map, tc);
        Assertions.assertEquals("Z : null/ F : ff/ S : ss/ T : tt", tc.toString());
    }

    @Test
    void objectToMapTest(){
        ObjectUtilTest.TestClass t = new ObjectUtilTest.TestClass("f", "s", "t");
        Map map = ObjectUtil.objectToMap(t);
        Assertions.assertNull(map.get("supers"));
        Assertions.assertNull(map.get("zero"));
        Assertions.assertEquals("f", map.get("first"));
        Assertions.assertEquals("s", map.get("second"));
        Assertions.assertEquals("t", map.get("third"));
    }

    class SuperSuperTestClass{
        String supers;
    }

    class SuperTestClass extends SuperSuperTestClass{
        String zero;
    }

    class TestClass extends SuperTestClass {
        private String first;
        private String second;
        private String third;

        public void setFirst(String first) {
            this.first = first;
        }

        public void setSecond(String second) {
            this.second = second;
        }

        public void setThird(String third) {
            this.third = third;
        }

        TestClass(){

        }

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

        public TestClass(String supers, String zero, String first, String second, String third){
            super.supers = supers;
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
}
