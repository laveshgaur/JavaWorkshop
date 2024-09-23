import java.util.*;
class matrixSum{
    static void sum(int a[][],int b[][],int c[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and column of first matrix : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int arr1[][] = new int [r1][c1];
        System.out.print("Enter elements of first matrix : ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter row and column of second matrix : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int arr2[][]=new int[r2][c2];
        System.out.print("Enter elements of second matrix : ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        if(r1==r2 && c1==c2){
            int arr3[][]=new int[r1][c1];
            sum(arr1,arr2,arr3);
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    System.out.print(arr3[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Matrices do not have same rows amd same columns");
        }
    }
}