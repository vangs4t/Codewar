public class Kata {
    /**
     * Mencari Keliling persegipanjang
     * @param l
     * @param w
     * @return
     */
    public static int areaOrPerimeter (int l, int w) {
        return l == w ? l * w : (l*2) + (w*2);
    }

    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(3, 4));
    }
}
//public class SolutionTest {
//    @Test
//    public void testSomething() {
//        assertEquals(16, Solution.areaOrPerimeter(4 , 4));
//        assertEquals(32, Solution.areaOrPerimeter(6 , 10));
//    }
//}
