package ex_013_String;

import com.sun.org.apache.xml.internal.resolver.readers.SAXCatalogParser;

import java.util.Scanner;

public class Lab033_palindrome_using_reverse_method {
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
        StringBuffer stringBuffer = new StringBuffer(input);
        return stringBuffer.reverse().toString();
    }
}
