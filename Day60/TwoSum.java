import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int arr[]={7,5,3,2,8};

        int sum=7;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++) {

            map.put(arr[i],i);

        }

        for(Map.Entry<Integer,Integer> value : map.entrySet()) {

            int diff=sum-value.getKey();

            if(map.containsKey(diff))
              System.out.println(value.getValue()+" "+map.get(diff));
              return;
        }
        
        
    }
    
}
