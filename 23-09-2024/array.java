import java.util.*;
class array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int n = sc.nextInt();
        System.out.print("Enter elements : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements are : ");
        for(int x:arr){
            System.out.print(x+ " ");
        }
        System.out.println();
    }
}