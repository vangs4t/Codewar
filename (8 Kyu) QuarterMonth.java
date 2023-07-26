public class Quarter {
    /**
     * Mencari Triwulan
     * @param month
     * @return
     */
    public static int quarterOf(int month) {
        int year = 12;
        if (month <= 3){
            return 1;
        } else if (month <= 6) {
            return 2;
        } else if (month <= 9) {
            return 3;
        } else if (month <= 12) {
            return 4;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(quarterOf(3));
    }
}
//public class SampleTest {
//    @Test
//    public void exampleTests() {
//        Tester.doTest( 3, 1);
//        Tester.doTest( 8, 3);
//        Tester.doTest(11, 4);
//    }
//}
