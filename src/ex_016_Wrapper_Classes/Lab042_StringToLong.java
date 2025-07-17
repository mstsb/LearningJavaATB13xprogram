package ex_016_Wrapper_Classes;

public class Lab042_StringToLong {
    public static void main(String[] args) {
        long x = Long.parseLong("123");
        System.out.println(x);

        Long l = Long.valueOf("123");
        long y = l.longValue();
        System.out.println(y);
    }
}
