package Assignment_1;

import java.util.Scanner;

public class Fibonacci_series {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many numbers : ");
        int n = input.nextInt();

        int a, b, fibo, i;
        a = 0;
        b = 1;
        if (n == 0) {
            System.out.println(a);
        } else if (n == 1) {
            System.out.println(b);
        } else {
            System.out.print(a+" ");
            System.out.print(b+" ");

            for (i = 0; i < n; i++) {
                fibo = a + b;
                a = b;
                b = fibo;
                System.out.print(fibo + " ");
            }
            System.out.print("\n");
        }
    }
}

