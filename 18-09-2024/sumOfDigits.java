import java.util.*;
class sumOfDigits{
    public static void main(String args[]){
        System.out.print("Sum of digit program \nEnter a digit : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfDigit=0;
        for(int i=n;i>0;i/=10){
            sumOfDigit+=i%10;
        }
        System.out.println("Sum of digit is "+sumOfDigit);
    }
}