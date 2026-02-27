package Exceptionhandling;

public class E3bank {
    static void main(String[] args) {
        try{
            int balance =2000;
            int withdraw = 3000;
            if(withdraw>balance){
                throw new ArithmeticException("Insufficient Balance");
            }

        System.out.println("Withdraw successfulll");
    }catch(ArithmeticException e){
        System.out.println("Exception Caught :" +e.getMessage());
    }
}
}