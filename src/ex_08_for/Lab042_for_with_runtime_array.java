package ex_08_for;

import java.util.Scanner;

public class Lab042_for_with_runtime_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        System.out.println("Enter array values");
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++ )
        {
            array[i] = sc.nextInt();
        }

        for(int i : array)
        {
            System.out.println(i);
        }
    }
}
