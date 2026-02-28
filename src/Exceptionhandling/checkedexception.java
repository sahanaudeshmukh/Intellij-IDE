package Exceptionhandling;

import java.io.IOException;

public class checkedexception {

    static void readfile() throws IOException{ /*this readfile is like CEO who solves problem
                                                 throws:giving JVM to handle this exception*/
        throw new IOException("File not found");

    }

    static void display() throws IOException{ // display() its like manager who dont know how to solve the problem so gives to CEO
        readfile();
    }

 static void show() throws IOException{// show() is like employee who dk hw ro handle problem
        display();
 }

    static void main(String[] args) {
        try{
            //show();
            display();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
