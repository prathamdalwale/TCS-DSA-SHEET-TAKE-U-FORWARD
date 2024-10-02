import java.util.Scanner;

public class LargestAndSmallestOfNumber {
    static void largestAndSmallest(int number) {
        int rem = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        while (number != 0) {
            rem = number % 10;
            min = Math.min(min, rem);
            max = Math.max(max, rem);
            number = number / 10;
        }
        System.out.println("LARGEST OF NUMBER:" + max + "\nSMALLEST OF NUMBER:" + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A number:");
        int number = sc.nextInt();
        largestAndSmallest(number);
    }
}
