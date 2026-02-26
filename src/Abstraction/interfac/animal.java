package Abstraction.interfac;

public interface animal {
    void sound(); //abstract method no body here let say if u use default void run() aga u can have body

    void run();// abstract method

}
class  lion implements animal{
    @Override
    public void sound() {
        System.out.println("roaar");
    }
    public void run(){
        System.out.println("running");
    }
}
class fa{
    static void main(String[] args) {
        lion l = new lion();
        l.sound();
        l.run();
    }
}
