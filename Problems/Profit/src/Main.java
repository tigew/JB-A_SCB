import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        double money = sc.nextInt();
        double percentIncrease = sc.nextInt();
        int neededMoney = sc.nextInt();
        int yearsTaken = 0;

        while (money < neededMoney) {
            money += (percentIncrease / 100) * money;
            yearsTaken++;
        }
        System.out.println(yearsTaken);
    }
}