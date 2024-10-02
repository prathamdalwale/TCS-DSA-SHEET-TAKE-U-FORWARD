import java.util.Scanner;

public class LcmOfTwoNumbers {
    static void lcmoftwonumbers(int num1, int num2) {
        for (int i = 2; i <= num2; i++) {

            if (num1 % i == 0 && num2 % i == 0) {

                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1 = sc.nextInt();
        System.out.println("enter number 2:");
        int num2 = sc.nextInt();
        lcmoftwonumbers(num1, num2);
    }
}
