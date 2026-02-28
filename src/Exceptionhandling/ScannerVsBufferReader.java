package Exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerVsBufferReader {
    static void main(String[] args) throws IOException { //giving JVM to handle this exception
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        BufferedReader br =  new BufferedReader( new InputStreamReader(System.in));
        String str = br.readLine(); //redline under readline will go only u put throws
        /* Buffer will take only String Datatype if  want int then covert string to int*/
        int a = Integer.parseInt(str);
    }
}
