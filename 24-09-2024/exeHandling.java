class exeHandling{
    public static void main(String args[]){
        try{
            int arr[]={2,4,7,1,9,4,0};
            System.out.println(arr[10]);
        }
        catch(Exception e){
            System.out.println("Out of range");
        }
    }
}