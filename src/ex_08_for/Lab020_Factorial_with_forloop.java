package ex_08_for;

import java.util.Scanner;

public class Lab020_Factorial_with_forloop
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no. : ");
        int n = scanner.nextInt();
        if (n == 0)
        {
            System.out.println("Result is : 1 ");
        } else
        {
            int f = 1;
            for (int i = 1; i <= n; i++)
            {
                f *= i;
            }
            System.out.println("Result is : " + f);
        }

    }
}

