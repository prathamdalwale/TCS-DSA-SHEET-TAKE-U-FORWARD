import java.util.Scanner;

public class SumOfNNaturalNumber {
    static int sumOfNaturalNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A number:");
        int number = sc.nextInt();
        System.out.println(sumOfNaturalNumber(number));
    }
}
