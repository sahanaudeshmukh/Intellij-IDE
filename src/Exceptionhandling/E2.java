package Exceptionhandling;

public class E2 {
    static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=0;
        try{
            k=i/j;
            int[] arr ={1,2,3,4,5};
            System.out.println(arr[10]);
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){ /*this is called MULTICATCH
        this is same as E1 program but we use this when we want in shortform*/

            System.out.println(e);
        }
    }
}
