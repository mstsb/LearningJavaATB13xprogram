package exam;

public class operators {

        public static void main(String[] args) {
            // a == b: false a > b: true a < b: false (a > b) && (a > 0): true (a < b) || (a > 0): true !(a > b): false
            int a = 10 , b = 5;
            System.out.println(a==b);
            System.out.println(a>b);
            System.out.println(a < b);
            System.out.println((a > b) && (a > 0));
            System.out.println((a < b) || (a > 0));
            System.out.println(!(a > b));

        }
}
