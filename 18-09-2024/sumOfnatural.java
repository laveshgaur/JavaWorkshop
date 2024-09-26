import java.util.*;
class sumOfnatural{
    public int sum(int n){
        int ans=0;
        for(int i=1;i<=n;i++){
            ans+=i;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Sum of n natural numbers\nEnter a number : ");
        int n = sc.nextInt();
        sumOfnatural s = new sumOfnatural();
        int ans = s.sum(n);
        System.out.println("Sum of n natural number is : "+ans);
        sc.close();
    }
}
