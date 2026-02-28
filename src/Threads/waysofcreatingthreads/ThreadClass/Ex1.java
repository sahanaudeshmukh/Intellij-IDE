package Threads.waysofcreatingthreads.ThreadClass;


    class MyThred extends Thread{ //This a our own thread
        public void run(){
            System.out.println("Thread is running!");

        }
    }
  public class Ex1{
         public static void main(String[] args) { //main is another thread
            MyThred t1 = new MyThred();
            t1.start();/* in threads we use start() here instead of run() bcz run() become a local here so*/
        }
    }

