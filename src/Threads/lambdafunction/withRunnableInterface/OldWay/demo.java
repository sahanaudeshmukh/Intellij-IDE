package Threads.lambdafunction.withRunnableInterface.OldWay;



//lass Mytask  implements Runnable{
//    public void run(){
//        System.out.println("Thread is runningggggg");
//    }
//}
//class Mytask  implements Runnable{
//    public void run(){
//        System.out.println("Thread is runningggggg");
//    }
//}



public class demo {
    static void main(String[] args) {
//        Mytask obj = new Mytask();
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Mytask1 is running");
            }
        });//threadd1
        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Mytask2 is running");

            }
        });

        t1.start();
        t2.start();
    }

}






