import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int end = sc.nextInt();
        int i = 1;

        while (i <= end) {
            double rootI = Math.sqrt(i);
            boolean pSquare = rootI - Math.floor(rootI) == 0;
            if (pSquare) {
                System.out.println(i);
            }
            i++;
        }
    }
}