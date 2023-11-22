public class GivenBitOnOFf {

    public static void main(String[] args) {
        

        int num = 10; // 0 0 0 0 1 0 1 0
                      // 0 0 0 0 1 0 0 0
                      // ---------------
                      // 0 0 0 0 1 0 0 0 -- see here getting value not 0 then bit is on.

        int i=3;
        int mask = 1<<i;

        if((num & mask) !=0)
          System.out.println(true);
        else
          System.out.println(false);  


    }
    
}
