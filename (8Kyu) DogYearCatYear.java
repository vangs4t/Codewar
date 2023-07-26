import java.util.Arrays;

public class Dinglemouse {
    /**
     * Membandingkan umur kucing atau anjing dengan manusia
     * @param humanYears
     * @return
     */

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catAge = 0;
        if (humanYears == 1){
            catAge = 15;
        } else if (humanYears == 2) {
            catAge = 24;
        } else {
            catAge = 24 + (humanYears - 2) * 4;
        }
        int dogAge;
        if (humanYears == 1){
            dogAge = 15;
        } else if (humanYears == 2) {
            dogAge = 24;
        } else {
            dogAge = 24 + (humanYears - 2) * 5;
        }

        return new int[] {humanYears,catAge,dogAge};
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(5)));
    }
}
//public class ExampleTest {
//
//    @Test
//    public void one() {
//        assertArrayEquals(new int[]{1,15,15}, Dinglemouse.humanYearsCatYearsDogYears(1));
//    }
//
//    @Test
//    public void two() {
//        assertArrayEquals(new int[]{2,24,24}, Dinglemouse.humanYearsCatYearsDogYears(2));
//    }
//
//    @Test
//    public void ten() {
//        assertArrayEquals(new int[]{10,56,64}, Dinglemouse.humanYearsCatYearsDogYears(10));
//    }
//
//}
