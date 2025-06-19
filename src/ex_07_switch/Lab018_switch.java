package ex_07_switch;

import java.util.Scanner;

public class Lab018_switch {
    public static void main(String[] args)
    {
        System.out.println("Enter day no.");
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        switch(d)
        {
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default :
                System.out.println("Invalid data");
                break; // optional if it is last case
        }

    }
}
