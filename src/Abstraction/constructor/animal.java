package Abstraction.constructor;

abstract class animal {

    animal(){
        System.out.println("animal constructor");
    }
    abstract void sound();

}
class dog extends animal {
    dog() {
        System.out.println("dog c");
    }

    void sound() {
        System.out.println("barkinggg");
    }
}
class ja{
    static void main(String[] args) {
        dog d= new dog();
        d.sound();
    }
}


/*
Why does Abstract class have Constructor?
* Constructor are used for initilizing common data!
* When a child class object is created,the Parent class Constructor rns first
 */