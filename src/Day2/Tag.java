package Day2;

import java.util.Scanner;

public class Tag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size : ");
        int size = sc.nextInt();

        //upper
        for (int i = 1; i <= size; i++) {
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            for (int space = 2 * i; space < 2 * size; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }


            System.out.println();


        }
        //lower
        for (int i = size; i>=1; i--) {
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            for (int space = 2 * i; space < 2 * size; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }


            System.out.println();


        }







    }
}
