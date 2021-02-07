import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // 3 groups new desks
        // 2 students per desk

        double groupA;
        double groupB;
        double groupC;
        int desksNeeded;

        groupA = Math.ceil((double) scanner.nextInt() / 2);
        groupB = Math.ceil((double) scanner.nextInt() / 2);
        groupC = Math.ceil((double) scanner.nextInt() / 2);


        desksNeeded = (int) groupA + (int) groupB + (int) groupC;


        System.out.println(desksNeeded);

    }
}