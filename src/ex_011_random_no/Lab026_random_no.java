package ex_011_random_no;
import java.util.Random;
import java.util.Scanner;
public class Lab026_random_no
{
        public static void main(String[] args)
        {
            System.out.println("Enter guess no");
            Random random = new Random();
            int n = random.nextInt(100)+1;

            Scanner scanner = new Scanner(System.in);

            int attempt = 0;
            while(true)
            {
                attempt++;
                int guessno = scanner.nextInt();
                if (guessno < n)
                {
                    System.out.println("Too low, try again");
                }
                else if(guessno > n)
                {
                    System.out.println("Too high, try again");
                }
                else
                {
                    System.out.println("Yes , it is : " + guessno);
                    break;
                }
            }
            System.out.println("attempt : "+ attempt);
        }

}
