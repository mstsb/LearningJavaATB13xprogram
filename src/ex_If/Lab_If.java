
import java.util.Scanner;


public class Lab_If{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Side : ");
        int side1 = scanner.nextInt();
        System.out.println("Enter Second Side : ");
        int  side2 = scanner.nextInt();
        System.out.println("Enter Third Side : ");
        int side3 = scanner.nextInt();

        System.out.println(side1);
        System.out.println(side2);
        System.out.println(side3);

        if ((side1 == side2) && (side2 == side3))
        {
            System.out.println("Equilateral");
        }
        else if ((side1 == side2) || (side2 == side3) || (side1 == side3))
        {
            System.out.println("Isosceles");
        }
        else
        {
            System.out.println("scalene");
        }
    }
}
