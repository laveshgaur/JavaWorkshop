import java.util.*;
class digitCount{
    public static void main(String args[]){
        System.out.print("Digit counter\nEnter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for(int i=n;i>0;i/=10)
        count++;
        System.out.println(count+" digits in this number");
    }
}