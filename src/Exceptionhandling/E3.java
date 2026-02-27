package Exceptionhandling;

public class E3 {
    static void checkage(int age){
        if(age>=18){
            System.out.println("Eligible - Access granted!");
        }else{
            throw new RuntimeException("Not eligible - Access denied!");
        }
    }




    static void main(String[] args) {
        //checkage(12);
        checkage(24);
    }
}
