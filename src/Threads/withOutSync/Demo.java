package Threads.withOutSync;

class Counter{
int count=0;
 synchronized void increment(){ /*if we dont put synchronized the output will not be 2000
 basically we call t1 and t2 both are counting 1000 and 1000 it should give 2000 but they will have competation nan first
 nin first antha aga crash may happen sometimes some counts are missed so it wont show 2000 by putting synchronized
 we can resolve this */
    count++;
}
}



public class Demo {
    static void main(String[] args) {
        Counter c = new Counter();
        Thread t1 = new Thread(()->{
            for(int i=0;i<1000;i++){
                c.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<1000;i++){
                c.increment();
            }
        });
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (Exception e){}
        System.out.println("Count : "+ c.count);
    }
}
