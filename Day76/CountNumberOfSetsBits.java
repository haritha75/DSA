public class CountNumberOfSetsBits {

    public static void main(String[] args) {
        
        int count =0;
        int num = 11;

        for(int i=0;i<32;i++) { // it takes so much time.even if do not have set bits we have check complete loop.
            int mask = 1<<i;
            if((num&mask)!=0)
              count++;
        }

        System.out.println(count);
    }
    
}
