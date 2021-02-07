import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int endDigit = sc.nextInt();
        int printCount = 0;

        boolean end = false;

        for (int i = 1; i <= endDigit && !end; i++) {
            for (int j = 0; j < i; j++) {
                printCount++;
                System.out.println(i + " ");
                if (printCount == endDigit) {
                    end = true;
                    break;
                }
            }
        }
    }
}