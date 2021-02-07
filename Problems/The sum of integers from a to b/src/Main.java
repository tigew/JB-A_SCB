import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int stop = sc.nextInt();
        int total = 0;

        for (int i = start; i <= stop; i++) {
            total += i;
        }

        System.out.println(total);
    }
}