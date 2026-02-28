package Exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E4point1 {
    static void main(String[] args)  throws Exception{
        String str;
        BufferedReader br = null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter somethinggg");
           str = br.readLine();
            System.out.println("You entered : "+str);

        }finally {
            br.close();
        }
    }
}
