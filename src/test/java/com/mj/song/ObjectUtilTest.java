package com.mj.song;

import com.mj.song.object.ObjectUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
