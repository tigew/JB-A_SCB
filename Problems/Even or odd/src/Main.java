import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int nextInt = sc.nextInt();
            String oddEven = nextInt % 2 == 0 ? "even" : "odd";

            if (nextInt == 0) {
                break;
            }

            System.out.println(oddEven);
        }
    }
}