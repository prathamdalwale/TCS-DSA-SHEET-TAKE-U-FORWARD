import java.util.Scanner;

public class NumberIsPrimeOrNotInRange {
    static boolean primeInRange(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A MIN RANGE");
        int min = sc.nextInt();
        System.out.println("ENTER A MAX RANGE");
        int max = sc.nextInt();
        for (int i = min; i <= max; i++) {
            if (primeInRange(i)) {
                System.out.println(i);
            }
        }
    }
}
