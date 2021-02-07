import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] parse = sc.nextLine().split(" ");


        long number = Long.parseLong(parse[0]);
        String operation = parse[1];
        long number2 = Long.parseLong(parse[2]);

        switch (operation) {
            case "+":
                System.out.println(number + number2);
                break;
            case "-":
                System.out.println(number - number2);
                break;
            case "/":
                if (number == 0 || number2 == 0) {
                    System.out.println("Division by 0!");
                    break;
                }
                System.out.println(number / number2);
                break;
            case "*":
                System.out.println(number * number2);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}