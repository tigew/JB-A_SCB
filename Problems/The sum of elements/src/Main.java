import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int total = 0;

        while (sc.hasNext()) {
            int nextNum = sc.nextInt();
            total += nextNum;
            if (nextNum == 0) {
                break;
            }
        }

        System.out.println(total);
    }
}