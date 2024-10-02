import java.util.Scanner;

public class AreaOfCircle {
    static double areaOfcircle(int r) {
        double ans = 0;
        final double PI = 3.14;
        ans = PI * r * r;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A radius:");
        int r = sc.nextInt();
        System.out.println(areaOfcircle(r));
    }
}
