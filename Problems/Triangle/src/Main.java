import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean s1 = a + b > c;
        boolean s2 = a + c > b;
        boolean s3 = b + c > a;

        if (s1 && s2 && s3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}