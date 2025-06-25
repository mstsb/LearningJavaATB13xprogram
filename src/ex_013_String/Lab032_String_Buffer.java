package ex_013_String;

public class Lab032_String_Buffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Tanuja");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.append("Singh"));
        System.out.println(stringBuffer);
        String string = stringBuffer.reverse().toString();
        System.out.println(string);
        System.out.println(stringBuffer);
    }
}
