package ex_016_Wrapper_Classes;

public class Lab043_StringToDouble {
    public static void main(String[] args) {
        double x = Double.parseDouble("123");
        System.out.println(x);

        Double d = Double.valueOf("123");
        double y = d.doubleValue();
        System.out.println(y);
    }
}
