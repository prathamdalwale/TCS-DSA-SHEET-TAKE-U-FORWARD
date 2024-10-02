import java.util.Scanner;

public class AutomorphicNumberOrNot {
    static void automorphicNumberOrNot(int num) {
        int temp = num * num, rem = 0, rev = 0;
        while (num != 0) {
            if (temp % 10 == num % 10) {
                num = num / 10;
                temp = temp / 10;
            }
        }

        if (num == temp) {
            System.out.println("Number is automorphic number");
        } else {
            System.out.println("number is not automorphic number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int num = sc.nextInt();
        automorphicNumberOrNot(num);
    }
}
