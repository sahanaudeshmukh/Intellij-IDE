package String;

public class bilderbufferperformance {
    static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Sahana");
        for(int i=0;i<10000000;i++){
            sb.append("Deshmukh");
        }
        System.out.println("Time taken by string buffer is :" + (System.currentTimeMillis() - startTime));

         startTime = System.currentTimeMillis();
        StringBuilder sbh = new StringBuilder("Sahana"); //builder is fasterrrrrrrr
        for(int i=0;i<10000000;i++){
            sbh.append("Deshmukh");
        }
        System.out.println("Time taken by string bulider is :" + (System.currentTimeMillis() - startTime)+"ms");


    }
}
