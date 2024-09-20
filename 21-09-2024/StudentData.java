import java.util.*;
class student{
    int rollno,marks1,marks2,marks3;
    String name;
    void enterdetails(){
        System.out.print("Enter roll name and three subject marks : ");
        Scanner sc = new Scanner(System.in);
        rollno=sc.nextInt();
        name=sc.next();
        marks1=sc.nextInt();
        marks2=sc.nextInt();
        marks3=sc.nextInt();
        sc.close();
    }
}
class newstudent extends student{
    long total,avg;
    void calculate(){
        total=(marks1+marks2+marks3);
        avg=total/3;
    }
    void display(){
        System.out.println("Name is "+name+"\nRoll no. : "+rollno+"\nMarks are : "+marks1+" "+marks2+" "+marks3+"\nTotal : "+total+"\nAvg : "+avg);
    }
}
class StudentData{
    public static void main(String[] args){        
        newstudent ns = new newstudent();
        ns.enterdetails();
        ns.calculate();
        ns.display();
    }
}
