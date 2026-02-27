
public class demo {
    static void createobj() {
        demo o = new demo(); //after the method execution is over this object in the heap will get eligible for garbage colection
    }
}
class ka{
   static void main(String[] args) {
        demo.createobj();
    }
}

