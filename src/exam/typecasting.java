package exam;

public class typecasting {
    public static void main(String[] args) {
        int a = 10;
        float b = 3.5f;
        System.out.println(a+b); // implicit casting
        float c = a+b;
        System.out.println((int)c); // explicit casting
    }
}
