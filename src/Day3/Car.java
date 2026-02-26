

// class with attributes


public class Car {
    String Brandname;
    int Manudate;
    String Color;


    //constructor
    //this constructor will not have return type even tho it is a function

     public Car(String Brandname,int Manudate,String Color){
         this.Brandname = Brandname;
         this.Manudate = Manudate;
         this.Color = Color;
     }
     void printdetails(){
         System.out.printf("car name : %s", Brandname);
         System.out.printf("manufacture date : %d" ,Manudate);
         System.out.printf("color : %s", Color);
     }
}
class Driver{


 public static void main(String[] args) {
     Car c1 = new Car("bjj",90,"vg");
     c1.printdetails();

 }
}