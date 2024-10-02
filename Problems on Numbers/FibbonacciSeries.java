import java.util.Scanner;

public class FibbonacciSeries {
    static void fibbonacciSeries(int number) {
        int firstterm = 0, secondterm = 1, thirdterm;

        for (int i = 0; i <= number; i++) {

            System.out.print(firstterm + " ");
            thirdterm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = thirdterm;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A  nth number:");
        int number = sc.nextInt();
        fibbonacciSeries(number);
    }
}