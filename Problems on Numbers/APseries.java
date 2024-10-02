import java.util.Scanner;

public class APseries {
    static int ap_series(int number, int a, int d) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {

            sum = sum + a;
            a = a + d;

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER TO PRINT AP SERIES UPTO:");
        int number = sc.nextInt();
        System.out.println("ENTER FIRST NUMBER IN AP SERIES:");
        int firstterm = sc.nextInt();
        System.out.println("ENTER DIFFERENCE IN AP SERIES:");
        int difference = sc.nextInt();
        System.out.println(ap_series(number, firstterm, difference));

    }
}
