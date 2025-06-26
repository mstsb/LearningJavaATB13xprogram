package ex_014_array;

public class Lab036_reverse_array
{
    public static void main(String[] args)
    {
        int[] array = {3,4,6,2,8};
        for(int i = (array.length-1); i >= 0; i--)
        {
            System.out.println(array[i]);
        }
    }
}
