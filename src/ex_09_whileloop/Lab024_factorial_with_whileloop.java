package ex_09_whileloop;

import java.util.Scanner;

public class Lab024_factorial_with_whileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no. : ");
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println("Result is : 1 ");
        } else {
            int f = 1, i = 1;
            while (i <= n) {
                f *= i;
                i++;
            }
            System.out.println("Result is : " + f);
        }

    }
}

