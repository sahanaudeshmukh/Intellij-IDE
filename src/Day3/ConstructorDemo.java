package Day3;
// interview question : the constructor is called automatically right! then prove it
public class ConstructorDemo {
    ConstructorDemo() {
        System.out.println("This is devil");
    }
}
class fa{
     public static void main(String[] args) {
         ConstructorDemo obj1= new ConstructorDemo();
         ConstructorDemo obj2= new ConstructorDemo();

    }
}
