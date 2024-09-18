import java.util.*;
class sumOfEvenNatural{
    public int sum(int n){
        int ans=0;
        for(int i=2;i<=n;i+=2){
            ans+=i;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Sum of even numbers upto n\nEnter a number : ");
        int n = sc.nextInt();
        sumOfEvenNatural s = new sumOfEvenNatural();
        int ans = s.sum(n);
        System.out.println("Sum of even natural number is : "+ans);
    }
}