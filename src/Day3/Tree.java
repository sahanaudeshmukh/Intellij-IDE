package Day3;

public class Tree {

        String color;
        int height;
        String spieces;


        //constructor
        //this constructor will not have return type even tho it is a function

        public Tree(String color,int height,String spieces){
            this.color = color;
            this.height = height;
            this.spieces = spieces;
        }
        void printdetails(){
            System.out.println("Tree color : " + color);
            System.out.println("Height  : " + height);
            System.out.println("Tree spieces : " + spieces);
        }
    }
    class Driver{


        public static void main(String[] args) {
            Tree t1 = new Tree("Green",600,"Shrubs");
            t1.printdetails();

        }
    }

