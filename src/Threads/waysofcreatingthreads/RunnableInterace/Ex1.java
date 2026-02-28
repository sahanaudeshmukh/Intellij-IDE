package Threads.waysofcreatingthreads.RunnableInterace;

class /*Mythread barala*/ Mytask implements Runnable{
    /* this is not a thread  "MyThread extends Thread" this is thread we are extending thread here
    "Mytask implements Runnable" this is not thread this is task */
    public void run(){
        System.out.println("Thread is runningggggg");//this will print 2 times bcz  t1.start(); and t2.start();


    }
}


public class Ex1 {
    static void main(String[] args) {
        Mytask obj = new Mytask();// task not thread
        Thread t1= new Thread(obj);// thread 1
        Thread t2= new Thread(obj);// thread 2

        t1.start();
        t2.start();/*instead of giving t1.start(); we first do "Thread t1= new Thread(obj);" bcz this program
         "Mytask implements Runnable" is task not thread.. so first we make it thread and then we run it by t1.start();
         let say if u give t1.start(); before "Thread t1= new Thread(obj);" this will give u error*/
    }

}
