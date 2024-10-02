import java.util.Scanner;

public class HarshadNumberOrNot {
    static void harshadNumber(int num) {
        int sum = 0, rem = 0, temp = num;
        while (num != 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        if (temp % sum == 0) {
            System.out.println("number is harshad number");
        } else {
            System.out.println("Number is not harshad number");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int num = sc.nextInt();
        harshadNumber(num);
    }
}
