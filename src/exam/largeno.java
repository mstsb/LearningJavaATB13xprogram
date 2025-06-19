package exam;

import java.util.Scanner;

public class largeno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if((a>b) && (a>c))
        {
            System.out.println("Largest no. : " + a);
        }
        else if ((b>a) && (b>c) )
        {
            System.out.println("Largest no. : " + b);
        }
        else if ((c>a) && (c>b))
        {
            System.out.println("Largest no. : " + c);
        }
        else
        {
            System.out.println("Invalid Data");
        }
    }
}
