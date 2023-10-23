import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {

    public static void main(String[] args) {

        int arr[]={3,2,6,3,8,7,3,11,2};

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++) {

            if(!map.containsKey(arr[i]))
                  map.put(arr[i],1);
            else {

                int previous=map.get(arr[i]);
                map.put(arr[i],previous+1);
            }    
        }

        int max=Integer.MIN_VALUE;

        int frequentKey=Integer.MIN_VALUE;

        for(Map.Entry<Integer,Integer> value : map.entrySet()) {

               if(value.getValue()>max) {

                    max=value.getValue();
                    frequentKey=value.getKey();
               }

        }
         System.out.println(frequentKey);
        
    }
}