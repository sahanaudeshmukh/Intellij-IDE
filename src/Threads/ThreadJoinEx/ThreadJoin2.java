package Threads.ThreadJoinEx;

class Mythread extends Thread{
    Thread other;
    Mythread(Thread other){
        this.other=other;
    }

    public void run(){
        try{
            if(other!=null){
                other.join();
            }
        }catch (Exception e){}
        System.out.println(Thread.currentThread().getName()+"Finished");
    }
}
public class ThreadJoin2 {
    static void main(String[] args) {
        Mythread t1= new Mythread(null);
        Mythread t2= new Mythread(t1);

        t1.start();
        t2.start();
    }

}
