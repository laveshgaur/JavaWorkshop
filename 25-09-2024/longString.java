import java.util.*;
class longString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String s = sc.next();
        System.out.print("Enter second string : ");
        String s1 = sc.next();
        if(s1.length()>s.length()){
            System.out.println(s1+" has greater length");
        }
        else if (s1.length()==s.length()){
            System.out.println("Both have length");
        }
        else{
            System.out.println(s+" has greater length");
        }
    }
}