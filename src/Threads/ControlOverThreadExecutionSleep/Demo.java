package Threads.ControlOverThreadExecutionSleep;
//sleep() basically this says that nidhe gandhali u r dng work yest jasthi nidhe idhre u do ur work slow aste!

    class Mythread extends Thread {
        public void run() {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Child : " + i);
                try {
                    Thread.sleep(1000); //this much time it will take to execute
                }catch (Exception e){}
            }
        }
    }
    class Demo{
        static void main(String[] args) {
            Mythread t1= new Mythread();
            t1.start();
        }
    }

