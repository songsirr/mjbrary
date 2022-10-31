package com.mj.song;

//import com.mj.song.object.ObjectUtil;
import com.mj.song.measurement.MEASUREMENT;
        import org.junit.jupiter.api.Test;

class NumberUtilTest {

//    @Test
//    void parseInt() {
//        Assertions.assertEquals(1, NumberUtil.parseInt("1"));
//        Assertions.assertEquals(0, NumberUtil.parseInt("NON"));
//    }
//
//    @Test
//    void time(){
//        int t = 8;
//        int[] s = {0, 0};
//        int[] e = {0, 7};
//        int[][] pattern = {{1,2}, {2,1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}, {-2, 1}, {-1, 2}};
//        Queue<Pair> q = new LinkedList<>();
//        q.add(new Pair(s[0], s[1]));
//        while (!q.isEmpty()){
//            Pair p = q.poll();
//
//            p.toString();
//
//            if(p.x == e[0] && p.y == e[1]){
//                System.out.println(p.cnt);
//                return;
//            }
//
//            for(int i = 0; i < pattern.length; i++){
//                int a = p.x + pattern[i][0];
//                int b = p.x + pattern[i][1];
//                int c = p.cnt + 1;
//
//                if (p.x < 0 || p.x >= t || p.y < 0 || p.y >= t){
//
//                } else {
//                    q.add(new Pair(a, b, c));
//                }
//            }
//        }
//    }
//
//    class Pair{
//        int x;
//        int y;
//        int cnt;
//
//        public Pair(int x, int y){
//            this.x = x;
//            this.y = y;
//            this.cnt = 0;
//        }
//
//        public Pair(int x, int y, int cnt){
//            this.x = x;
//            this.y = y;
//            this.cnt = cnt;
//        }
//
//        public void move(int[] arr){
//            this.x += arr[0];
//            this.y += arr[1];
//        }
//
//        @Override
//        public String toString() {
//            return "x = " + this.x + " || y = " + this.y + " || cnt = " + this.cnt;
//        }
//    }
//
//    @Test
//    void test(){
//        Map<String, String> m = new HashMap<String, String>();
//
//        m.put("key1", "v1");
//        m.put("key2", "v2");
//        m.put("key3", "v3");
//
//        System.out.println(m.toString());
//    }

    @Test
    void test2(){
        MEASUREMENT.LENGTH.from("ss").to("asd").convert(100);
        String[] arr = {"123", "234", "345"};
        System.out.println(arr.length);
    }
}