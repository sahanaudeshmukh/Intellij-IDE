package Day3;

public class CopyConstructor {//also example of overloading i.e compile time
    String name;
    int usn;

    CopyConstructor(String name,int usn) {
        this.name = name;
        this.usn = usn;
    }
// Copy Constructor
        CopyConstructor( CopyConstructor C){
            this.name=C.name;
            this.usn=C.usn;


        }
        void display(){
            System.out.println(name+" "+usn);
        }


    }
    class ga{
      public   static void main(String[] args) {
          CopyConstructor s1 = new CopyConstructor("Sahana",94);
          CopyConstructor s2 = new CopyConstructor(s1);  //copying of s1
          s1.display();
          s2.display();


        }
    }


