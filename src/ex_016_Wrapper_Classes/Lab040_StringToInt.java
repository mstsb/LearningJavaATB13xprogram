package ex_016_Wrapper_Classes;

public class Lab040_StringToInt {
    public static void main(String[] args) {
        int x = Integer.parseInt("123");
        System.out.println(x);

        Integer i = Integer.valueOf("123");
        int y = i.intValue();
        System.out.println(y);
    }
}
