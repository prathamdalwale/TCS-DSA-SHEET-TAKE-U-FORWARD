import java.util.Scanner;

public class LeapYearOrNot {
    static boolean leapYear(int number) {
        if (number % 4 == 0) {
            return true;
        }
        if (number % 400 == 0) {
            return true;
        }
        if (number % 100 == 0) {
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A year:");
        int number = sc.nextInt();
        if (leapYear(number)) {
            System.out.println("the year is leap year");
        } else {
            System.out.println("the is not leap year");
        }
    }
}
