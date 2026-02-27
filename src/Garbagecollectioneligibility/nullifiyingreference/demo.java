package Garbagecollectioneligibility.nullifiyingreference;
//nullifying reference
public class demo {
    static void main(String[] args) {
        {
            demo obj = new demo();
            obj=null; // this object is now eligible for garbage collection
            System.out.println(obj);
        }
    }

}
