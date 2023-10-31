public class SubArrayWithZeroSum {

    public static void main(String[] args) {

        int a[]={-3,2,3,1,6};
        int arr[]={4,2,-3,1,6};
        int sum;
        for(int count=1;count<=arr.length;count++) {
            for(int i=0;i<=arr.length-count;i++) {
                sum=0;
                for(int j=i;j<i+count;j++) {
                    sum +=arr[j];

                }

                if(sum==0) {
                  System.out.println(true);
                  return;
                }
                  
            }
        }
        System.out.println(false);
        
    }
}