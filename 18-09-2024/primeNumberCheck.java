import java.util.*;
class primeNumberCheck{
    public static void main(String args[]){
        System.out.print("Prime number checker\nEnter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for(int i=2;i<n;i++){
            if (n%i==0){
                count++;
            }
        }
        if(count!=0){
            System.out.println("Number is not prime");
        }
        else{
            System.out.println("Number is prime");
        }
    }
}