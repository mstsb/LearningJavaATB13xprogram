import java.util.Scanner;
class Main {
    public static void main(String[] args)
      {
        System.out.println("Enter no.");
        Scanner scanner = new Scanner(System.in);
        if(!scanner.hasNextFloat())
        {
            System.out.println("Enter Integer Value");
            return;
        }
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(i + " ");
        }
    }
}


        
