package Exceptionhandling;

public class E1 {
    static void main(String[] args) {
//        int i ,j,k;
//        i=24;
//        j=12;
//        k=i/j;
//        System.out.println(k); this gives correct output but we should ty for excetion write mainly exception is used when like you have a doubt like 50-50 may happen or not aga
        int i,j,k=0;
        i=10;
        j=0;
        try{
            k=i/j;
            int[] arr ={1,2,3,4,5};
            System.out.println(arr[10]);
        }catch(ArithmeticException e) {
            System.out.println("Undefined");
            //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
            //	at Exceptionhandling.E1.main(E1.java:16) this will come if u not put catch(arrayindexoutofbondexception e) thing

        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index"); // this will not print bcz program will stop dng at undefinied adhu adhan aste clear maduthe mundhe dhu nodala so this part wll not get print

        }catch(Exception e) {
            System.out.println("Unknown Exception Occured!"); //this is used when ntg works but u shoudnot use it more bcz this take more resource bcz using this try other and try use this its like qarrel happpend anko instead of callig police u directly call PM

        }finally {
            System.out.println("this will print no matter wt!");


        }
        System.out.println("hello");


    }static {
        System.out.println("Execution starts"); //this will print first bcz static even this is in main cls also this is not a function this is just a block
    }}


