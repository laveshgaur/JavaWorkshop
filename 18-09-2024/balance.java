import java.util.*;
class balance{
    public void checkBalance(Double amount){
        if(amount>1000){
            System.out.println("Balance is Sufficient");
        }
        else{
            System.out.println("Balance is not Sufficient");
        }
    }
    public static void main(String args[]){
        balance b = new balance();
        System.out.print("Enter your balance : ");
        Scanner sc = new Scanner(System.in);
        Double bal = sc.nextDouble();
        b.checkBalance(bal);
        sc.close();
    }
}
