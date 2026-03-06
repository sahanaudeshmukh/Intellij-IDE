package Threads.lambdafunction.withRunnableInterface.withoutlambda;

interface calculator{
    int add(int a,int b);

}

public class demo2{
    static void main(String[] args) {
        calculator c = new calculator() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
        int result = c.add(90,80);
        System.out.println("Result : "+result);
    }
}
