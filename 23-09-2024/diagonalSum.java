import java.util.*;
class diagonalSum{
    static int sum(int a[][]){
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i==j){
                    temp+=a[i][j];
                }
                if((i+j)==a.length-1){
                    temp+=a[i][j];
                }
            }
        }
        return temp;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and column : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int [r][c];
        if(r==c){
            System.out.print("Enter elements : ");
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("Sum of diagonals is : "+sum(arr));
        }
        else{
            System.out.println("Rows and columns are not equal");
        }
    }
}