import java.util.*;
class palindrome{
    public void isPalindrome(int n){
        int newNumber=0;
        for(int i=n;i>0;i/=10){
            int r = i%10;
            newNumber=newNumber*10+r;
        }
        if(newNumber==n){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
    public static void main(String args[]){
        palindrome p = new palindrome();
        System.out.print("Palindrome Check \nEnter integer number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        p.isPalindrome(number);

    }
}