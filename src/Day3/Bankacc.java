package Day3;

public class Bankacc {
    String accountholder;
    double balance;

    public Bankacc(String accountholder,double balance){
        this.accountholder=accountholder;
        this.balance=balance;
    }
    void deposit(double amount){

        amount+=balance;
        System.out.println("Upated balance: "+amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance ");

        }
    }

    void displayBalance(){
            System.out.println("Accountholder name :"+ accountholder);
            System.out.println("Current balance : " + balance);
        }
    }


 class sd{
      public static void main(String[] args) {
          Bankacc ba=new  Bankacc("Sahana",800);
          ba.deposit(900);
          ba.withdraw(500);
          ba.displayBalance();
     }




}