import java.util.Arrays;

public class TwoSunUsingTwoPointerTechnique {

    public static void main(String[] args) {
        
        int arr[]={3,5,7,1,9};
        int tar=6;
        Arrays.sort(arr);

        int start=0;
        int end = arr.length-1;

        while(start<end) {
            int cur= arr[start]+arr[end];
            if(cur==tar) {
                System.out.println("Pair found ");
                return;
            }
            else if(cur>tar) 
              end--;
            else 
              start++;  
        }

    }
    
}
