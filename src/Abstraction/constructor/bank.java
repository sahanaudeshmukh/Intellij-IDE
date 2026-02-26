package Abstraction.constructor;


abstract class bank {
    String branch;
    bank(String branch){
        this.branch=branch;
    }
    abstract void calculateintrst();
}
class hdfc extends bank{
    hdfc(String branch){
        super((branch));
    }
    void calculateintrst(){
        System.out.println("intrst is 10%");
    }
}
class ll{
    static void main(String[] args) {
        hdfc obj=new hdfc("rr");
        obj.calculateintrst();

    }
}
/*
 Interview Question :
 Why does abstract class have Constructor?
-> Constructor are used for initialising common data
-> When a child class object is created the parent class constructor runs first
-> Parent constructor is getting executed because of inheritance and not because of object creation(this is to be answered in the interview)
 */
