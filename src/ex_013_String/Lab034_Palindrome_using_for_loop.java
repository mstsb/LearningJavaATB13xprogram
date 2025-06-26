package ex_013_String;

import java.util.Scanner;

public class Lab034_Palindrome_using_for_loop {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        String result = Palindrome(s);

        if(result.equalsIgnoreCase(s))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }

    static String Palindrome(String input)
    {
        String reversed = "";
        for(int i=input.length()-1;i>=0;i--)
        {
            reversed = reversed + input.charAt(i);
        }
            return reversed;
    }
}
