import java.util.*;
class sumOverloading{
    static int sum(int a,int b){
        return a+b;
    }
    static float sum(float a,float b){
        return a+b;
    }
    static long sum(long a,long b){
        return a+b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter two floats values : ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        System.out.print("Enter two long values : ");
        long x1 = sc.nextLong();
        long y1 = sc.nextLong();
        System.out.println("Sum of integers values is : "+sum(a,b));
        System.out.println("Sum of floats values is : "+sum(x,y));
        System.out.println("Sum of long values is : "+sum(x1,y1));
    }
}