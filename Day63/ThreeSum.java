import java.util.HashSet;

public class ThreeSum {


    public static void main(String[] args) {
        
        int arr[]={2,5,7,8,11};
        int target=14;

        ThreeSumEx(arr,target);


    }

    public static void ThreeSumEx(int arr[],int target) {

        
       for(int i=0;i<arr.length-2;i++) {

            HashSet<Integer> set = new HashSet<>();


            int firstCon = target-arr[i];

           for(int j=i+1;j<arr.length;j++) {

            int req=firstCon-arr[j];
               if(set.contains(req)) {
                  System.out.println("found :"+" "+arr[i]+" "+arr[j]+" "+req);
                  return;
               }
               set.add(arr[j]);
           }
       }     
      System.out.println("not found");
        
    }
}