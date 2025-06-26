// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Simple_Program {
    public static void main(String[] args) {
        String s = "Hello ";
        String s1 = "World";
       /* Write a Java program that demonstrates basic string operations including concatenation, length, substring, and character extraction.*/
        String s2 = s.concat(s1);
        System.out.println(s2);
        
         System.out.println("Length : " + s2.length());
         
        System.out.println("First char : " + s2.charAt(0));
          
         System.out.println("Substring : " + s2.substring(6,11));  
        
        


       
    }
}
