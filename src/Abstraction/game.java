package Abstraction;

abstract class game {
    abstract void cricket();

    void batminton() {
        System.out.println("niceee");
    }
}

  class gulf extends game {
      void cricket() {
          System.out.println("doingggg");
      }
  }
  class kabaddi extends game{
    void cricket(){
        System.out.println("playingg");
    }
  }
   class kj{
       static void main(String[] args) {
           gulf g = new gulf();
           g.cricket();
           g.batminton();
           kabaddi k = new kabaddi();
           k.cricket();
           k.batminton();

       }
   }






