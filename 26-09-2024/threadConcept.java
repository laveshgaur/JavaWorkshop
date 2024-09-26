class threadConcept extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        threadConcept thread = new threadConcept();
        thread.start();
        System.out.println("Outside the thread");
    }
}