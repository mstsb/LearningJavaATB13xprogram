import java.util.Scanner;
class Main {
    public static void main(String[] args)
      {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no : ");
        if(!scanner.hasNextInt())
        {
            System.out.println("Enter Integer Value");
            return;
        }
        int a = scanner.nextInt();
        
        if(a%100==0)
        {
            if ((a%100==0) && (a%400==0))
            {
                System.out.println(a + " is a leap year ");
            }
            else
            {
                System.out.println(a + " is not a leap year "); 
            }
        }
        else if(a%4==0)
        {
            System.out.println(a + " is a leap year ");
        }
        else
        {
            System.out.println(a + " is not a leap year ");
        }
    }
}
