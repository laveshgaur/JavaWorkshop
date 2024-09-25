import java.util.*;
class palindromeString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.next();
        char c[] = new char[s.length()];
        for(int i=s.length()-1,j=0;i>=0;i--){
            c[j++]=s.charAt(i);
        }
        String s1 = new String(c);
        System.out.println(s1);
        int ans = s.compareTo(s1);
        if(ans==0){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}