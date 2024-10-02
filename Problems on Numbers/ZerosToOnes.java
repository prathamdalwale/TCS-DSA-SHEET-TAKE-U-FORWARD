import java.util.Scanner;

public class ZerosToOnes {
    static void coversion(int number) {

        int rem = 0, rev = 0, temp = number, reverse = 0;

        while (number != 0) {
            rem = number % 10;
            if (rem == 0) {
                rem = 1;
            }
            rev = rev * 10 + rem;
            number = number / 10;
        }

        // System.out.println(rev);
        while (rev != 0) {
            rem = rev % 10;
            reverse = reverse * 10 + rem;
            rev = rev / 10;
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER:");
        int number = sc.nextInt();
        coversion(number);

    }
}
