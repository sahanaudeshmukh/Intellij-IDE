package Threads.waysofcreatingthreads.RunnableInterace;





class Mytak implements Runnable{

    public void run(){
        for(int i=1;i<=10;i++) {
            System.out.println("My thread : "+ i);
        }

    }
}
public class Ex2 {
    static void main(String[] args) {
        Mytak obj = new Mytak();
        Thread t1= new Thread(obj);
        t1.start();
        for(int i=1;i<=10;i++) {
            System.out.println("Main thread: "+i);
        }
    }

}
