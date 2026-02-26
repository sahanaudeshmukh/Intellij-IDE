package Abstraction;

abstract class animal {
     abstract void sound();
    void run(){
        System.out.println("Running");


    }
}
class lion extends animal{
    void sound(){
        System.out.println("sounding");
    }
}

class cat extends animal{
    void sound(){
        System.out.println("soundd");
    }
}

class gt{

static void main(String[] args) {

 lion l = new lion();
 l.sound();
 l.run();
 cat c = new cat();
 c.run();

}
}
