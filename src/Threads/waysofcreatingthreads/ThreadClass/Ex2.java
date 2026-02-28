package Threads.waysofcreatingthreads.ThreadClass;
/*Here "My Thread running" and "Main Thread running" will run independently like first "Main Thread running" run agbek antha ila
it may suffle run it many times and see*/


class MyThread extends Thread{ //This a our own thread
    public void run(){
        for(int i=1;i<=5;i++) {
            System.out.println("My Thread running!"+i);
        }
    }
}


public class Ex2 {
    public static void main(String[] args) { //main is another thread
        MyThread t1 = new MyThread();
        t1.start();/* in threads we use start() here instead of run() bcz run() become a local here so*/
        for(int i=1;i<=5;i++) {
            System.out.println("Main Thread running!"+i);
        }
    }

}
/*
start() creates new thread
run() contains logic
Output order is unpredictable
Both the threads independently
 */
