import java.util.Scanner;

public class GreatestOfThreeNumbers {
    static int greatestofThree(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER 1:");
        int num1 = sc.nextInt();
        System.out.println("ENTER NUMBER 2:");
        int num2 = sc.nextInt();
        System.out.println("ENTER NUMBER 3:");
        int num3 = sc.nextInt();
        System.out.println("Greatest of three is :" + greatestofThree(num1, num2, num3));
    }
}
