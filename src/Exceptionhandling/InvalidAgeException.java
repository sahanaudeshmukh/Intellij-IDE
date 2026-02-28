package Exceptionhandling;

public class InvalidAgeException  extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}
 class driver{
    static void vote(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be above 18!");
        }
        System.out.println("You can vote!");
    }

     static void main(String[] args) {
         try{
             vote(17);
         }catch (InvalidAgeException e){
             System.out.println(e.getMessage());
         }
     }
 }

