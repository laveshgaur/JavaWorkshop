import java.util.*;
class greatestOfThree{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter three nummbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("Greatest of three is "+a);
        }
        else if(b>a && b>c){
            System.out.println("Greatest of three is "+b);
        }
        else{
            System.out.println("Greatest of three is "+c);
        }
    }
}