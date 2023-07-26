public class AllStar {
    /**
     * Mencari Jumlah huruf dalam string yang di input
     * @param str
     * @param letter
     * @return
     */
    public static int strCount(String str, char letter) {
        int striCount = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if (chars[i] == letter){
                striCount++;
            }
        }
        return striCount;
    }

    public static void main(String[] args) {
        System.out.println(strCount("Hallo", 'z'));
    }
}
//public class basicTests {
//    @Test
//    public void testSomething() {
//        assertEquals(1, CodeWars.strCount("Hello", 'o'));
//        assertEquals(2, CodeWars.strCount("Hello", 'l'));
//        assertEquals(0, CodeWars.strCount("",'z'));
//    }
//}
