import java.util.*;
class lowerTriangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns of matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter elements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        if(r==c){
            System.out.println("Lower Triangle ");
            for(int i=0;i<r;i++){
                for(int j=0;j<=i;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Rows and columns are not equal ");
        }
        sc.close();
    }
}