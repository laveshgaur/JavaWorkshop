import java.util.*;
class tableOfNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Table printer\nEnter a number : ");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
        sc.close();
    }
}
