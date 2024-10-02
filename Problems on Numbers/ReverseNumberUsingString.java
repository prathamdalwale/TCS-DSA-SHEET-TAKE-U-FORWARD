import java.util.Scanner;

public class ReverseNumberUsingString {
    static void reverseNumber(int number) {
        int rev = 0;
        String nochange = "";
        while (number != 0) {
            rev = number % 10;
            nochange = nochange + rev;
            number = number / 10;
        }
        System.out.println(nochange);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to Reverse:");
        int number = sc.nextInt();
        reverseNumber(number);
    }
}
