package Polymorphism.compiletime;

public class addition {
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}
    class Driver{
        public static void main(String[] args) {
            addition obj = new addition();
            obj.add(1,2);
            obj.add(1,2,3);
        }
    }

