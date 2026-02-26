package Abstraction.interfac.notabstract;

//Why interfaces are not 100% abstract!

public interface demo {
void show();

default void  display(){
    System.out.println(" default method"); // this won't print until unless u create a new subclass
}
static void message(){
    System.out.println("static method");
}


}
class ja{
    static void main(String[] args) {
        demo.message();// u cannot give demo.display bcz that is not static
    }
}
