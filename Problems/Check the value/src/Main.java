import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int value = scanner.nextInt();

        boolean isCorrectValue = value < 10 && value > 0;

        System.out.println(isCorrectValue);
    }
}