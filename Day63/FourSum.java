import java.util.HashSet;

public class FourSum {


    public static void main(String[] args) {
        
        int arr[]={2,5,7,8,11,15};
        int target=26;

        ThreeSumEx(arr,target);


    }

    public static void ThreeSumEx(int arr[],int target) {

        int startInd,endInd;

        for(int i=0;i<arr.length-3;i++) {

            for(int j=i+1;j<arr.length-2;j++) {
                startInd=j+1;
                endInd=arr.length-1;

                while(startInd<endInd) {

                    if(arr[i]+arr[j]+arr[startInd]+arr[endInd]==target) {
                          System.out.println(arr[i]+" "+arr[j]+" "+arr[startInd]+" "+arr[endInd]);
                          startInd++;
                          endInd--;
                          return;
                    }
                    else if(arr[i]+arr[j]+arr[startInd]+arr[endInd]<target)
                      startInd++;
                    else
                     endInd--;  
                      
                }
            }
        }
    }
        
       
}