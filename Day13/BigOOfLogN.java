public class BigOOfLogN {
    public static void main(String[] args) {

     int n = 1024;
     int count = 0;

        for (int i = 1; i <n; i*=2) {
            count++;
        }
        System.out.println(count);
    }
}
/* 

here, we are doubling the value that's why it iterate 10 times.

log 1024 base 2 then  2^x = 1024
                      2^x = 2^10
                      x = 10

                      Time complexity of this problem is O(logn)

                      Logarithmic time complexity is far more efficient and scalable as n grows.

          */            