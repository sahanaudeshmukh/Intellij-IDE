package String.Stringbufferbuilder;

public class stringbufferexample {


        public void append(){
            StringBuffer sb = new StringBuffer("Sahana");
            System.out.println("Old String : " +sb);
            sb.append(" be strong!");
            System.out.println("New String : " +sb);
        }

        public void insert(){
            StringBuffer sb = new StringBuffer("Sahana");
            System.out.println("Old String : " +sb);
            sb.insert(1,"aaaaaaaa");
            System.out.println("Old String : " +sb);
        }
        public void reverse(){
            StringBuffer sb = new StringBuffer("Sahana");
            System.out.println("Old String : " +sb);
            sb.reverse();
            System.out.println("Old String : " +sb);
        }



    }
    class pa{
        static void main(String[] args) {
            stringbufferexample s = new  stringbufferexample() ;
            s.append();
            s.insert();
            s.reverse();


    }
    }
