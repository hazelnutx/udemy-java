
public class DayOfTheWeek {

    private static final String INVALID_VALUE = "Invalid value";

    public static void main(String[] args) {
        printDayOfTheWeek(7);
        ifElsePrint(1);
    }

    public static void printDayOfTheWeek(int day) {

        switch (day) {
        case 0:
            System.out.println("Monday");
            break;
        case 1:
            System.out.println("Tuseday");
            break;
        case 2:
            System.out.println("Wednsday");
            break;
        case 3:
            System.out.println("Thursday");
            break;
        case 4:
            System.out.println("Friday");
            break;
        case 5:
            System.out.println("Saturday");
            break;
        case 6:
            System.out.println("Sunday");
            break;
        default:
            System.out.println(INVALID_VALUE);
            break;
        }
    }

    public static void ifElsePrint(int day) {
        if (day == 0) {
            System.out.println("Monday");
        } else if (day == 1) {
            System.out.println("Tuesday");
        }
    }
}