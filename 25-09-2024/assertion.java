//before running the code you have to insert -ea between java and class fiile name  eg. java -ea assertion
import java.util.*;
class assertion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        assert age>=18:"Not Valid";
        System.out.println("Age is "+age);
    }
}