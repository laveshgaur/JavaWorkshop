//Enter the arguments when you run the byte code file which is class file which will be created when you compile this file  
class totalMarks{
    public static void main(String args[]){
        double total = 0.0 ,av;
        for(int i=1;i<args.length;i++){
            total+=Double.parseDouble(args[i]);
        }
        System.out.println("Name is "+args[0]);
        System.out.println("Total marks : "+total);
        System.out.println("Average marks : "+(total/(args.length-1)));
    }
}