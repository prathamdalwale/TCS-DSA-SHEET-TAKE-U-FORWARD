import java.util.Scanner;

public class NumberIspalindromeOrNot {
    static void palindrome(int number) {
        int rem = 0, rev = 0, temp = number;
        while (number != 0) {

            rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;

        }

        System.out.println(rev);

        if (temp == rev) {
            System.out.println("NUMBER IS PALINDROME");
        } else {
            System.out.println("NUMBER IS NOT PALINDROME");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER TO CHECK PALINDROME OR NOT");
        int number = sc.nextInt();
        palindrome(number);
    }
}
