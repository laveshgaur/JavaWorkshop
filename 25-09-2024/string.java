import java.util.*;
class string{
    public static void main(String args[]){
        String s = "java";//String literal method 
        char c[]={'h','e','l','l','o'};
        String s1 = new String(c);
        System.out.println("String using literal is : "+s);
        System.out.println("String using character : "+s1);
        System.out.println("In upper case : "+s.toUpperCase());
        System.out.println("In upper case : "+s1.toUpperCase());
    }
}