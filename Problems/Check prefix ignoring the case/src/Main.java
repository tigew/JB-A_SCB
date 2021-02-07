import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(word.toLowerCase().startsWith("j"));
    }
}