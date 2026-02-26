package String;

public class stringimmutable {
    static void main(String[] args) {
        String str ="Hello";
        str.concat("World");//this wont work
        System.out.println(str);
        //iste kotree it will print only hello

        str=str.concat(" World");
        System.out.println(str);
    }
}
