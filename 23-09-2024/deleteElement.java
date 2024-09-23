import java.util.*;
class deleteElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        System.out.print("Enter elements : ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter value of element for delete : ");
        int value = sc.nextInt();
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==value)
                break;
        }
        while(i<n-1){
            arr[i]=arr[i+1];
            i++;
        }
        n--;
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}