import java.util.*;
class sumOfMultipleOfThree{
    public int sum(int n){
        int ans=0;
        for(int i=0,a=3;i<n;i++,a+=3){
            ans+=a;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Sum of first n multiples of 3\nEnter a number : ");
        int n = sc.nextInt();
        sumOfMultipleOfThree s = new sumOfMultipleOfThree();
        int ans = s.sum(n);
        System.out.println("Sum is : "+ans);
    }
    sc.close();
}
