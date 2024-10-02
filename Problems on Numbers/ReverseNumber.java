import java.util.Scanner;

public class ReverseNumber {
    static int reverse_num(int number) {
        int rev = 0, rem = 0;
        while (number != 0) {
            rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO REVERSE:");
        int number = sc.nextInt();
        System.err.println(reverse_num(number));
    }
}
