import java.util.*;
class volumeOverloading{
    static int volume(int a){
        return a*a*a;
    }
    static int volume(int a,int b,int c){
        return a*b*c;
    }
    static double volume(double r){
        return (4/3)*Math.PI*r*r*r;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of cube : ");
        int a = sc.nextInt();
        System.out.print("Enter sides of cuboid : ");
        int l,b,h;
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        System.out.print("Enter radius of sphere : ");
        double r = sc.nextDouble();
        System.out.println("Volume of cube is : "+volume(a));
        System.out.println("Volume of cuboid is : "+volume(l,b,h));
        System.out.println("Volume of sphere is : "+volume(r));
    }
}