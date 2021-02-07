import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        boolean un_ordered = true;
        int previousInt = 0;
        boolean isUp = true;
        boolean isDown = true;
        previousInt = sc.nextInt();

        do {
            // This does not account for changing changing list
            // direction double has occured
            int nextInt = sc.nextInt();
            if (nextInt == 0 || !un_ordered) {break;}

            if (previousInt >= nextInt && isDown ) {
                un_ordered = true;
                isUp = previousInt == nextInt;
            } else if (previousInt <= nextInt && isUp) {
                un_ordered = true;
                isDown = previousInt == nextInt;
            } else {
                un_ordered = false;
            }
            previousInt = nextInt;
        } while (sc.hasNext());

        System.out.println(un_ordered);
    }
}