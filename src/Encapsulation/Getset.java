package Encapsulation;
//encapsulationnn
public class Getset {

        private String name;
        private int usn;

        Getset(String name,int usn){
            this.name=name;
            this.usn=usn;
        }

        String getName(){

            return this.name;
        }

        void setName(String name){
            this.name=name;
        }

        int getusn(){


            return this.usn;
        }

        void setusn(int usn){
            this.usn=usn;
        }

        void printDetails(){
            System.out.println("Student name:" + name);
            System.out.println("Student usn:" + usn);
        }
    }

    class Dh{
        public static void main(String[] args) {
            Getset s1=new Getset ("Sachin",24);
            s1.printDetails();
            System.out.println("Name:" + s1.getName());
            s1.setName("Sach");
            System.out.println("Name:" + s1.getName());

        }
    }

