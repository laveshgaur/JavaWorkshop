import java.util.*;
class pattern2{
    public static void main(String args[]){
        for(int i=25;i>=5;i-=5){
            for(int j=5;j<=i;j+=5){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}