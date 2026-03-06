package Threads.lambdafunction.withRunnableInterface.withoutlambda;

interface calci{
    int add(int a, int b);

}

public class ex2{
    static void main(String[] args) {
        calci c = (a,b) -> a+b;
            System.out.println( c.add(90,90));
        }

    }

