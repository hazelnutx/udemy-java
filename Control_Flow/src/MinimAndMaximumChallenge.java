import java.util.Scanner;

public class MinimAndMaximumChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maxValue = 0;
        int minValue = 0;

        while (true) {

            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                if (number > maxValue) {
                    maxValue = number;
                } else if (number < maxValue) {
                    minValue = number;
                }

            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min value :" + minValue + " and maxValue : " + maxValue);
        scanner.close();
    }
}