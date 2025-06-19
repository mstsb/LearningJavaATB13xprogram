package exam;

import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no : ");
        int a = scanner.nextInt();
        if(a>0)
        {
            System.out.println("Positive");
        }
        else if (a<0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("This is 0");
        }
    }
}
