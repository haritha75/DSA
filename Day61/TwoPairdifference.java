import java.util.HashSet;
import java.util.Set;

public class TwoPairdifference {

    public static void main(String[] args) {
        

        int arr[]={3,11,15,34,6,8,9,7};

        int diff=5;
        System.out.println(countPairsWithGivenDiff(arr, diff));


    }

    static int countPairsWithGivenDiff(int arr[],int diff) {

        Set<Integer> set = new HashSet<>();

        for(var x: arr)
          set.add(x);

        int count=0;
        
        for(var c:arr) {

            if(set.contains(c+diff))
              count++;
            if(set.contains(c-diff))  
              count++;
            
            set.remove(c);  
        }
        return count;

    }
    
}
