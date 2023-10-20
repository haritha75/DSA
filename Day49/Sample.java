public class Sample {

    public static void main(String[] args) {
        int i=5;
        int j=9;
        int k=6;
        System.out.println( getSequencesSum(i, j, k)
);

        
    }

    public static long getSequencesSum(int i,int j,int k) {

        long sum=0;
        for(long h=i;h<=j;h++) {
            sum =sum+h;
        }

        for(long m=j-1;m>=k;m--) {
            sum +=m;
        }

        return sum;

    }
}