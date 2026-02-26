package Polymorphism;

public class compiletime {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
class ka{
    static void main(String[] args) {
        compiletime c = new compiletime();
            c.add(1,2);
            c.add(5,9);
        }
    }


