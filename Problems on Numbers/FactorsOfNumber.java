import java.util.Scanner;

public class FactorsOfNumber {
    static void factorsOfnumber(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A number:");
        int number = sc.nextInt();
        factorsOfnumber(number);
    }
}
