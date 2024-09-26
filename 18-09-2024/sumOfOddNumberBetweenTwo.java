import java.util.*;
class sumOfOddNumberBetweenTwo{
    public int sum(int a,int b){
        int ans=0;
        for(int i=a;i<=b;i++){
            if(i%2==0){
                continue;
            }
            else{
                ans+=i;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Sum of odd numbers between two numbers\nEnter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sumOfOddNumberBetweenTwo s = new sumOfOddNumberBetweenTwo();
        int ans = s.sum(a,b);
        System.out.println("Sum is : "+ans);
    }
    sc.close();
}
