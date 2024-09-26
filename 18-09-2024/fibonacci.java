import java.util.*;
class fibonacci{
    public int fibo(int n){
        if (n<=1){
            return n;
        }
        else{
            return (fibo(n-1)+fibo(n-2));
        }
    }
    public static void main(String args[]){
        fibonacci f = new fibonacci();
        System.out.print("Fibonacci series\nEnter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(f.fibo(i)+" ");
            sc.close();
        }
    }
}
