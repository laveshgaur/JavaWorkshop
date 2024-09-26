class Mythread1 extends Thread{
    void table(int n){
        for(int i=1;i<=10;i++){
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}

public class Mythread{
    public static void main(String[] args) {
        Mythread1 mythread1 = new Mythread1();
        mythread1.table(5);
    }
}
