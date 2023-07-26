import static java.time.Year.of;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        return of(year).isLeap();
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2020)); // true
        System.out.println(isLeapYear(2000)); // true
        System.out.println(isLeapYear(2015)); // false
        System.out.println(isLeapYear(2100)); // false
    }
}
//public class LeapYearTest
//{
//
//    @Test
//    public void testYear2020()
//    {
//        assertEquals(true, LeapYears.isLeapYear(2020));
//    }
//
//    @Test
//    public void testYear2000()
//    {
//        assertEquals(true, LeapYears.isLeapYear(2000));
//    }
//
//    @Test
//    public void testYear2015()
//    {
//        assertEquals(false, LeapYears.isLeapYear(2015));
//    }
//
//    @Test
//    public void testYear2100()
//    {
//        assertEquals(false, LeapYears.isLeapYear(2100));
//    }
//}
