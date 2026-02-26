package Day3;

public class Treewithoutthis {
    String color;
    int height;
    String spieces;


    //constructor
    //this constructor will not have return type even tho it is a function
   //class name and constructor name should be same
    public Treewithoutthis (String cr,int ht,String ss){
        color = cr;
        height = ht;
        spieces = ss;
    }
    void printdetails(){
        System.out.println("Tree color : " + color);
        System.out.println("Height  : " + height);
        System.out.println("Tree spieces : " + spieces);
    }
}
class Sa{


    public static void main(String[] args) {
        Treewithoutthis t1 = new Treewithoutthis("Green",89,"Shrubs");
        t1.printdetails();

    }
}
