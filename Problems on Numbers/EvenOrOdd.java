import java.util.Scanner;

public class EvenOrOdd {
    static void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Its even number");
        } else {
            System.out.println("Its odd number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        int number = sc.nextInt();
        evenOrOdd(number);
    }
}
