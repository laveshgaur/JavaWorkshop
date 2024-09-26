import java.util.*;
class sumOfEvenNatural{
    public int sum(int n){
        int ans=0;
        for(int i=0,a=2;i<n;i++,a+=2){
            ans+=a;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Sum of n even numbers\nEnter a number : ");
        int n = sc.nextInt();
        sumOfEvenNatural s = new sumOfEvenNatural();
        int ans = s.sum(n);
        System.out.println("Sum is : "+ans);
        sc.close();
    }
}
