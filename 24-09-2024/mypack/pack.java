package mypack;
public class pack{
    public void welcome(){
        System.out.println("Welcome to my package");
    }
    public int add(int...n){
        int sum=0;
        for(int i=0;i<n.length;i++){
            sum+=n[i];
        }
        return sum;
    }
}
