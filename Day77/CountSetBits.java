public class CountSetBits {

    public static void main(String[] args) {
        int n = 10;
          int count = 0; //1 0 1 0
                         //1 0 0 1
                         //---------
                          // 1 0 0 0 --8
                         //  0 1 1 1
                        //   --------
                        //   0 0 0 0 ---0


        while (n!=0) {
            n = n&(n-1);
            count++;
        }
        System.out.println(count);
    }
}