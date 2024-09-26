import java.util.*;
class swapArray{
    static void swap(int a[]){
        for(int i=0;i<a.length-1;i+=2){
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        System.out.print("Enter elements : ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("After swap : ");
        swap(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}