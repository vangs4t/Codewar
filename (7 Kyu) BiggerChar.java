import java.util.stream.IntStream;

public class BiggerChar {
    /**
     * Mencari String Terbesar
     * @param x
     * @param y
     * @return
     */
    public static String battle(final String x, final String y) {
        /**
         * Urutkan Alphabet sesuai penomoran
         * Ganti String menjadi CharArray
         * Jumlahkan alphabet yang ada di dalam string x dan y
         * banding kan Sesuai dengan logika terbesar
         * Kembalikan string yang memiliki Jumlah penomoran terbesar
         * Jika Logika Menghasilkan Setara Maka kembalikan Dengan String pihak ketiga
         */
        String tie = "Tie!";
        int xx = x.length();
        char[] ex = x.toCharArray();
        int[] exx = new int[xx];
        for (int i = 0; i < xx; i++){
            int halo = (int)ex[i] - (int)'A' + 1;
            exx[i] = halo;
        }
        int yy = y.length();
        char[] ey = y.toCharArray();
        int[] eyy = new int[yy];
        for (int i = 0; i < yy; i++){
            int halo = (int)ey[i] - (int)'A' + 1;
            eyy[i] = halo;
        }
        int sum = IntStream.of(exx).sum();
        int sam = IntStream.of(eyy).sum();
        /**
         * sum mewakili x
         * sam mewakili y
         */
        if (sum < sam){
            return y;
        } else if (sam < sum){
            return x;
        } else if (sam == sum) {
            return tie;
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(battle("AAA", "Z"));
        System.out.println(battle("ONE", "NEO"));
        System.out.println(battle("FOUR", "FIVE"));
    }
}
//public class SampleTest {
//    @Test
//    public void basicTests() {
//        doTest("AAA",  "Z",    "Z");
//        doTest("ONE",  "TWO",  "TWO");
//        doTest("ONE",  "NEO",  "Tie!");
//        doTest("FOUR", "FIVE", "FOUR");
//    }
//    private void doTest(final String x, final String y, final String expected) {
//        assertEquals(expected, BattleOfTheCharacters.battle(x, y));
//    }
//}
