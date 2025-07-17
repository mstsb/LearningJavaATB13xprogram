package ex_016_Wrapper_Classes;

public class Lab041_StringToFloat {
    public static void main(String[] args) {
        float x = Float.parseFloat("123");
        System.out.println(x);

        Float f = Float.valueOf("123");
        float y = f.floatValue();
        System.out.println(y);
    }
}
