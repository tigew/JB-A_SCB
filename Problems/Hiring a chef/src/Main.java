//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String age = sc.nextLine();
        String education = sc.nextLine();
        String experience = sc.nextLine();
        String cuisine = sc.nextLine();

        System.out.println("The form for " + name + " is completed. We will contact you if we need a chef that cooks " + cuisine + " dishes.");
    }
}