public class Maxprofit1 {
    public static void main(String[] args) {

        int a[]= {7,1,5,3,6,4};

        int max=0;

        for(int i=0;i<a.length-1;i++) {
            for(int j=i+1;j<a.length;j++) {
                int curr= a[j]-a[i];
                if(curr>max)
                  max=curr;

            }
        }
        System.out.println(max);
    }
    
}
