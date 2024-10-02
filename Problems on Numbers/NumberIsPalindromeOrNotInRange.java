import java.util.Scanner;

public class NumberIsPalindromeOrNotInRange {
    static boolean Palindrome(int number) {
        int rev = 0, rem = 0, temp = number;
        while (number != 0) {
            rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }
        if (temp == rev) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A Min Range:");
        int min = sc.nextInt();
        System.out.println("\nEnter a Max range:");
        int max = sc.nextInt();
        for (int i = min; i <= max; i++) {
            if (Palindrome(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
