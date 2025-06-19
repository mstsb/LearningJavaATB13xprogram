package ex_If;

import java.util.Scanner;

public class Lab020_que {
    public static void main(String[] args) {
        System.out.println("Enter any char : ");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().toLowerCase().charAt(0);
        if (ch == 'a')
        {
            System.out.println("it is vowel");
        }
        else if (ch == 'e')
        {
            System.out.println("it is vowel");
        }
        else if (ch == 'i')
        {
            System.out.println("it is vowel");
        }
        else if (ch == 'o')
        {
            System.out.println("it is vowel");
        }
        else if (ch == 'u')
        {
            System.out.println("it is vowel");
        }
        else
        {
            System.out.println("It is consonant");
        }
    }
}
