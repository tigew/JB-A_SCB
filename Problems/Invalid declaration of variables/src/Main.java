public class Main {

    public static void main(String[] args) {

        // Add type to these two variables
        int a = 512_343;
        //int b = 3_431_231;

        float f = (float) (20d + 20.02f); // 1
        long n = 10 + 2L;       // 2
        byte b = (byte) (n + 5);         // 3

        System.out.println(a + b);
    }
}