package Threads.lambdafunction.withRunnableInterface.withoutlambda;

interface Greeting{
    void sayhello();

}

public class ex1 {
    static void main(String[] args) {
        Greeting g= () ->{
            System.out.println("hello world");
        };
        g.sayhello();
    }
}

