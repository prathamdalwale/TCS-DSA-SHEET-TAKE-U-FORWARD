import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {
    static void armstrongNumber(int number) {
        int count = 0, rem = 0, rev = 0, temp = number, n = number;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.print(count);
        while (temp > 0) {
            rem = temp % 10;
            rev += (int) Math.pow(rem, count);
            temp = temp / 10;
        }
        if (rev == n) {
            System.out.println("the number is armstrong");
        } else {
            System.out.println("number is not armstrong");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO CHECK ARMSTRONG OR NOT:");
        int number = sc.nextInt();
        armstrongNumber(number);

    }
}
