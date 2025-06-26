package ex_014_array;

public class Lab037_sum_of_array {
    public static void main(String[] args) {
        int[] array = {3, 4, 6, 2, 8};
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
