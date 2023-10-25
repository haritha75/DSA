import java.util.ArrayList;
import java.util.HashSet;

public class MissingValuesEx {

    public static void main(String[] args) {

        int arr[]={5,2,8,12,6,15};
        int low=2;
        int high=15;
        System.out.println(missingValues(arr,low,high));
        

    }

    public static ArrayList<Integer> missingValues(int arr[],int low,int high) {

            HashSet<Integer> set=new HashSet<>();

            ArrayList<Integer> list = new ArrayList<>();

            for(var x:arr)
              set.add(x);
            for(int i=low;i<high;i++) {
                if(!set.contains(i))
                  list.add(i);
            }  

            return list;

    }
    
}
