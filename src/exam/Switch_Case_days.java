import java.util.Scanner;
class Main {
    public static void main(String[] args)
      {
        System.out.println("Enter day no.");
        Scanner scanner = new Scanner(System.in);
        if(!scanner.hasNextInt())
        {
            System.out.println("Enter Integer Value");
            return;
        }
        int d = scanner.nextInt();
        switch(d)
        {
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid day number");
                break;
        }

    }
}
