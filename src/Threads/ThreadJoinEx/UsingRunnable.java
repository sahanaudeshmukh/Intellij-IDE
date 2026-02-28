package Threads.ThreadJoinEx;

class Mytask implements Runnable{

        public void run(){
            for(int i=0;i<=5;i++) {
                System.out.println("Child :" +i);

            }
        }
    }

    public class UsingRunnable {
        static void main(String[] args)  throws Exception{
            Mytask obj = new Mytask();
            Thread t1= new Thread(obj);


            t1.start();
            t1.join();
            System.out.println("Main thread!");

        }

    }


