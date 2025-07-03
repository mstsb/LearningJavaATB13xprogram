package ex_06_If;

import java.util.Scanner;

public class lab040_Largest_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no");
        int a = sc.nextInt();
        System.out.println("Enter second no");
        int b = sc.nextInt();
        System.out.println("Enter third no");
        int c = sc.nextInt();

        if(a>=b && a>=c)
        {
            System.out.println("Largest no." + a);
        }
        else if (b>=a && b>=c)
        {
            System.out.println("Largest no." + b);
        }
        else
        {
            System.out.println("Largest no." + c);
        }
    }
}
