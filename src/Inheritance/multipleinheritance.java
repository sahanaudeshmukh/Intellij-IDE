package Inheritance;
// multipleinheritance is not supported so interface comes in abstraction

    interface mom{
         default void cook(){
             System.out.println("Indian");

        }}
        interface dad{
            default void cook(){
                System.out.println("Italian");

            }

    }
    class child implements mom,dad{
        @Override
        public void cook() {
            mom.super.cook();
        }
    }


class ka{
    static void main(String[] args) {
        child c = new child();
        c.cook();
    }
}
