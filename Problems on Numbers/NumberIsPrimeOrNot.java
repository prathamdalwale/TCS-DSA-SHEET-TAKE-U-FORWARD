import java.util.Scanner;

public class NumberIsPrimeOrNot {
    static void primeOrNot(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is not Prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        int number = sc.nextInt();
        primeOrNot(number);
    }
}
