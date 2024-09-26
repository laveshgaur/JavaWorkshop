import java.io.*;
public class fileOutput {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("/home/ubuntu/abc.txt");
            fout.write(65);
            fout.close();
            System.out.println("Successfully saved...");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
