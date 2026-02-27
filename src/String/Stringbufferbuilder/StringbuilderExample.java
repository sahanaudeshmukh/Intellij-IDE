package String.Stringbufferbuilder;

public class StringbuilderExample {

    public void append(){
        StringBuilder sb = new StringBuilder("Sahana");
        System.out.println("Old String : " +sb);
        sb.append(" be strong!");
        System.out.println("New String : " +sb);
    }

    public void insert(){
        StringBuilder sb = new StringBuilder("Sahana");
        System.out.println("Old String : " +sb);
        sb.insert(1,"aaaaa");
        System.out.println("Old String : " +sb);
    }
    public void reverse(){
        StringBuilder sb = new StringBuilder("Sahana");
        System.out.println("Old String : " +sb);
        sb.reverse();
        System.out.println("Old String : " +sb);
    }



}
class ka{
    static void main(String[] args) {
        StringbuilderExample s = new StringbuilderExample();
        s.append();
        s.insert();
        s.reverse();
    }
}