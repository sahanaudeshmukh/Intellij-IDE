package Day2;

public class Swap {

         static void swap(int a,int b){
           int temp =a;
            a=b;
            b=temp;
             System.out.println(a);
             System.out.println(b);

        }

        public static void main(String[] args) {
            int a=10;
            int b=20;
            System.out.println(a);
            System.out.println(b);

            swap(a,b);


        }
    }

