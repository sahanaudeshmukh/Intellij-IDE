package Abstraction.stati;


    abstract class animal{
        static void info(){//abstract class cannot be made static
            System.out.println("living beings");

        }
        abstract void sound(); //abstract class cannot be made static
    }
    class dog extends animal{
        void sound(){
            System.out.println("dog barks");
        }
    }

class ka{
    static void main(String[] args) {
        animal.info();
        dog d = new dog();
        d.sound();

    }
}