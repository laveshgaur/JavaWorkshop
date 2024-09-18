import java.util.*;
class factorial{
    public int fac(int n){
        if(n>0)
        return n*fac(n-1);
        return 1;
    }
    public static void main(String args[]){
        factorial f = new factorial();
        System.out.print("Factorial program\nEnter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f.fac(n));
    }
}