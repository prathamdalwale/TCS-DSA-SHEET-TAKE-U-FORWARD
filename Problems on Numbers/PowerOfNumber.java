import java.util.Scanner;

public class PowerOfNumber {
    static int powerOfNumber(int number, int power) {
        int ans = 1;
        for (int i = 1; i <= power; i++) {
            ans = ans * number;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A number:");
        int number = sc.nextInt();
        System.out.println("ENTER A number:");
        int power = sc.nextInt();
        System.out.println(powerOfNumber(number, power));
    }
}
