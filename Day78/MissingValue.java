public class MissingValue {
    public static void main(String[] args) {

        int arr[] = {1,3,2,5};
        int res = 0;

        for(int i=0;i<arr.length;i++)
            res ^= arr[i];
        
        for(int i=1;i<=arr.length+1;i++)
             res^=i;

        System.out.println(res);
        
    }
}