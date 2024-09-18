import java.util.*;
class perfectNumber{
    public int perfectNumberCheck(int n){
        int temp=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                temp+=i;
            }
        }
        if(temp==n){
            return 1;
        }
        else{
            return -1;
        }
    }
    public static void main(String args[]){
        System.out.print("Perfect number checker\nEnter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        perfectNumber p = new perfectNumber();
        int ans=p.perfectNumberCheck(n);
        if(ans==1){
            System.out.println("It is perfect number");
        }
        else{
            System.out.println("It is not a perfect number");
        }
    }
}