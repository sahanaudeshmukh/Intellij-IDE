package String;

public class stringfunctiondemo {
    static void main(String[] args) {
        //Created strings
        String s1="Sahana Deshmukh";
        String s2= new String("Sahana Deshmukh");
        System.out.println("Original String :" + s1);

        //length()
        System.out.println("Length is : " + s1.length());

        //charat()
        System.out.println("Character at index 3 : " + s1.charAt(3));

        //touppercase and tolowercase
        System.out.println("Upper case : " + s1.toUpperCase());
        System.out.println("Lower case : " + s1.toLowerCase());

        //equal() and ==
        System.out.println("Using == : " + s1==s2);
        System.out.println("Using equal() : " + s1.equals(s2));

        //compareto()
        System.out.println("Using compareto() : "+ s1.compareTo(s2));

        //substring
        System.out.println("Substring (0 to 4) : " + s1.substring(0,4));

        //contain()
        System.out.println("Contains Sahana  : "+s1.contains("Sahana"));

        //indexof()
        System.out.println("Index of a : " +s1.indexOf("a"));

        //replace()
        System.out.println("Replace the Sahana with Sachin :" +s1.replace("Sahana","Sachin") );

        //startwith() and endwith()
        System.out.println("Is it start with Deshmukh : " +s1.startsWith("Deshmukh"));
        System.out.println("Is it end with Sahana : " +s1.endsWith("Deshmukh"));

        //trim()
        String s3 = "      Apppaji     ";
        System.out.println("Before trim : "+s3);
        System.out.println("After trim : " + s3.trim());

        //concat()
        System.out.println("Concating the some other word : " +s1.concat(" is a bad bitch!"));

        //isEmpty()
        String s4="";
        System.out.println("Will chechk is it empty : " +s4.isEmpty());
        String s5=" ";
        System.out.println("Will check is it empty : " +s5.isEmpty());

        //split()
        String s = "Dude! don't get fuckinn attached to anyone!!!!!";
        String[] arr = s.split(" "); //regex means regular expression
        System.out.println("After split : ");
        for(String i : arr){
            System.out.println(i);
        }

        //isblank()
        String s6="";
        System.out.println("Check if it is blank : " +s6.isBlank());
        String s7=" ";
        System.out.println("Check if it is blank: " +s7.isBlank());
        String s8=" SAhana ";
        System.out.println("Check if it is blank : " +s8.isBlank());








    }
}
