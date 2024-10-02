import java.util.Scanner;

public class PositiveAndNegativeNumber {
    static void positiveOrNegative(int number) {
        if (number > 0) {
            System.out.println("number is positive");
        } else {
            System.out.println("number is negative");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A number:");
        int number = sc.nextInt();
        positiveOrNegative(number);
    }
}
