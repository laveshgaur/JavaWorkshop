import java.util.*;
import mypack.*;
class example{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers for sum : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        pack p = new pack();
        int sum = p.add(a,b);
        System.out.println("Sum is : "+sum);
    }
}