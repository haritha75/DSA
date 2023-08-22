public class TwoSum {

    public static void main(String[] args) {
        
        int arr[]={1,2,4,6,7,11};
        int target =10;

        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]+arr[j]==target) {
                    System.out.println("found the pair");
                    return;
                }
            }
        }
        System.out.println("Pair not found");
    }
}