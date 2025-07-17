package ex_016_Wrapper_Classes;

public class Lab044_IntToFloat {
    public static void main(String[] args) {
        float x = Float.parseFloat(String.valueOf(123));
        System.out.println(x);

        Float f = Float.valueOf(123);
        float y = f.floatValue();
        System.out.println(y);
    }
}
