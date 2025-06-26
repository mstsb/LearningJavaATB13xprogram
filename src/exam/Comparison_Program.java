// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Comparison_Program {
    public static void main(String[] args) {
        String s1= "Hello";
        String s2 = "hello";
        String s3 = "Hello";
       /* String1: "Hello", String2: "hello", String3: "Hello"
       equals(): false, equalsIgnoreCase(): true, compareTo(): -32
*/

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        
        System.out.println("equals(): " + s1.equals(s2));
         
        System.out.println("equalsIgnoreCase() : " + s1.equalsIgnoreCase(s2));
          
         System.out.println("compareTo():" + s1.compareTo(s2));  
        
        


       
    }
}
