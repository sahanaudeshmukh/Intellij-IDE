package Abstraction.interfac.defamethod;

public interface vehical {
    void start();
    //void stop(); this will give error to overcome this u should default
    default void stop(){
        System.out.println("stopping");
    }
}// this is y not 100% abstract

    class audi implements vehical {
        public void start() {
            System.out.println(" audi is runing");
        }
    }

    class bmw implements vehical {
        public void start() {
            System.out.println(" bmw is runing");
        }
    }

    class mahindra implements vehical {
        public void start() {
            System.out.println(" mahindra is runing");
        }

    }
    class pq {
        static void main(String[] args) {
            bmw w = new bmw();
            w.start();
            w.stop();
            mahindra m = new mahindra();
            m.start();
            m.stop();
            bmw b = new bmw();
            b.start();
            b.stop();

        }
    }

