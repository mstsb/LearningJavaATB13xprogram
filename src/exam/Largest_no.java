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
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if((a>b) && (a>c))
        {
            System.out.println("Largest number is: " + a);
        }
        else if ((b>a) && (b>c))
        {
            System.out.println("Largest number is: " + b);
        }
        else
        {
            System.out.println("Largest number is: " + c);
        }
    }
}
