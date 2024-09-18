import java.util.*;
class armstrongNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Armstrong number checker\nEnter a number : ");
        String str = sc.nextLine();
        int n = Integer.parseInt(str);
        int temp=0;
        for(int i=n;i>0;i/=10){
            temp+=Math.pow(i%10,str.length());
        }
        if(n==temp){
            System.out.println("Number is armstrong ");
        }
        else{
            System.out.println("Number is not armstrong");
        }
    }
}