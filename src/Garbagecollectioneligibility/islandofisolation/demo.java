package Garbagecollectioneligibility.islandofisolation;

public class demo {
//Main interview problem
    demo ref; //datatype of this variable is its own class
}
class la{
    static void main(String[] args) {
        demo o1 = new demo();
        demo o2 = new demo();

        o1.ref=o2;
        o2.ref=o1;

        o1=null;
        o2=null;

    }
}
