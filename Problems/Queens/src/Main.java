import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        boolean vertical = x1 == x2;
        boolean horizontal = y1 == y2;
        boolean diagonal = Math.abs(x1 - x2) == Math.abs(y1 - y2);

        if (vertical || horizontal || diagonal) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = true;
        boolean result = (b1 && b2) ? b1 : (b2 || b3) ? b2 : b3;
    }
}