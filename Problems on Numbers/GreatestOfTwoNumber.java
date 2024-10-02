import java.util.Scanner;

public class GreatestOfTwoNumber {
    static int greatestOfTwo(int num1, int num2) {
        if (num1 < num2) {
            return num2;
        } else {
            return num1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A number 1:");
        int num1 = sc.nextInt();
        System.out.println("ENTER A number 2:");
        int num2 = sc.nextInt();
        System.out.println("GREATEST NUMBER IS:" + greatestOfTwo(num1, num2));
    }
}
