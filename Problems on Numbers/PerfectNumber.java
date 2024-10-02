import java.util.Scanner;

public class PerfectNumber {
    static void perfectNumber(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == number) {
            System.out.println("NUMBER IS PERFECT NUMBER");
        } else {
            System.out.println("NUMBER IS NOT PERFECT NUMBER");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO CHECK IT IS PERFECR NUMBER OR NOT:");
        int number = sc.nextInt();
        perfectNumber(number);
    }
}