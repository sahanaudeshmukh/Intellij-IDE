package Threads.lambdafunction;


interface greeting{
    void sayhello();
}
public class demo {
    static void main(String[] args) {
        greeting g= new greeting() {
            @Override
            public void sayhello() {
                System.out.println("Hello World!");
            }
        };
        g.sayhello();
    }
}
