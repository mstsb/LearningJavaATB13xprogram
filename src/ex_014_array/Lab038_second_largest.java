package ex_014_array;

import java.util.Arrays;

public class Lab038_second_largest
{
    public static void main(String[] args)
    {
        int[] array = {3, 4, 6, 2, 8};
        Arrays.sort(array);
        System.out.println(array[array.length-2]);
    }
}
