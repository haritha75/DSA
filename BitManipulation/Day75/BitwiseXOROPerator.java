public class BitwiseXOROPerator {

    public static void main(String[] args) {
        

        int num = 10; // 0 0 0 0 1 0 1 0
                      // 0 0 0 0 1 0 0 0
                      //------------------
                      // 0 0 0 0 0 0 1 0 -- here also particular bit off.


        int i=3;

        int mask = 1<< i;
        System.out.println(num^mask);
    }
    
}
