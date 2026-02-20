package Day1;

import java.util.Scanner;
public class stu {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st mark : ");
        int a=sc.nextInt();
        System.out.print("Enter 2st mark : ");
        int b=sc.nextInt();
        System.out.print("Enter 3st mark : ");
        int c=sc.nextInt();
        System.out.print("Enter 4st mark : ");
        int d=sc.nextInt();
        System.out.print("Enter 5st mark : ");
        int e=sc.nextInt();

        double total=a+b+c+d+e;
        System.out.println("Total : "+total);

        double percentage=(total / 500) * 100;
        System.out.println("Percentage : "+percentage);
        if (percentage>=75)
            System.out.print("A");

        else if(percentage>=50)
            System.out.print("B");

        else if(percentage>=30)
            System.out.print("C");

        else
            System.out.print("FAIL");
        sc.close();









    }


}
