import java.util.Scanner;

public class CountsNumberInDigit {
    static int countsDigit(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("ENTER A NUMBER TO COUNT:");
        int number = sc.nextInt();
        System.out.println(countsDigit(number));
    }
}
