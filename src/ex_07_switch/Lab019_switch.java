package ex_07_switch;

import java.util.Scanner;

public class Lab019_switch {
    public static void main(String[] args) {
        System.out.println("Enter day : ");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.next().toLowerCase();

        switch (day) {
            case "monday":
                System.out.println("It is Monday");
                break;
            case "tuesday":
                System.out.println("It is Tuesday");
                break;


            default:
                System.out.println("Invalid Data");
                break;
        }
    }
}