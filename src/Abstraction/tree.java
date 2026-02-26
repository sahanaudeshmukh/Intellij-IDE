package Abstraction;

abstract class tree {
     abstract void brezze();
     void food(){
         System.out.println("give food");
     }

}
class mango extends tree{

void brezze() {
    System.out.println("brezzing");
}
}
class orange extends tree{
    void brezze(){
        System.out.println("blow");
    }
}
class ha{
    static void main(String[] args) {
        mango m = new mango();
        m.brezze();
        m.food();
        orange o = new orange();
        o.brezze();
        o.food();
    }
}

