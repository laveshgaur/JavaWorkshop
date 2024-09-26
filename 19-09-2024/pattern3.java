import java.util.*;
class pattern3{
    public static void main(String args[]){
        for(int i=5;i<=25;i+=5){
            for(int j=25;j>=i;j-=5){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
