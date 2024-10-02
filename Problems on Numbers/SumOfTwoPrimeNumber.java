import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

public class SumOfTwoPrimeNumber {
    static void sumOftwoPrime(int number) {
        int count = 0,n=number,max=0,min=0;
        for (int i = 1; i <= number; i++) {
            if(i % i==0)
            {
                mi
            }
            if(number%i==0)
            {

            }
           
        }
        if (count <= 2) {
            System.out.print("prime number");
        } else {
            System.out.println("not prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int number = sc.nextInt();
        sumOftwoPrime(number);
    }
}
