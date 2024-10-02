import java.util.Scanner;

public class FactorialOfNumber {
    static int factorialOfnumber(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A  nth number:");
        int number = sc.nextInt();
        System.out.println(factorialOfnumber(number));
    }
}
