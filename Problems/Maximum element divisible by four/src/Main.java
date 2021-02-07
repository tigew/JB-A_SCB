import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int end = sc.nextInt();
        int highestDiv4 = 0;

            for (int i = 0; i < end; i++) {
                int testNum = sc.nextInt();
                if (testNum % 4 == 0 && testNum > highestDiv4) {
                highestDiv4 = testNum;
           }
        }

        System.out.println(highestDiv4);
    }
}