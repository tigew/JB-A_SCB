import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int totalDays;
        int foodCostPerDay;
        int oneWayFlightCost;
        int hotelCostPerDay;
        int vacationTotal;

        totalDays = scanner.nextInt();
        foodCostPerDay = scanner.nextInt();
        oneWayFlightCost = scanner.nextInt() * 2;
        hotelCostPerDay = scanner.nextInt();

        vacationTotal = (foodCostPerDay + hotelCostPerDay) * totalDays + oneWayFlightCost - hotelCostPerDay;

        System.out.println(vacationTotal);
    }
}