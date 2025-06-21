package ex_010_dowhile;

import java.util.Scanner;

public class Lab025_factorial_with_dowhile_loop
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
            int f = 1, i = 1;
            do
            {
                f *= i;
                i++;
            }
            while (i <= n);
            System.out.println("Result is : " + f);
        }

    }
}

