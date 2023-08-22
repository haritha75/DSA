import java.util.HashSet;

public class TwoSumUsingHashSet {
    public static void main(String[] args) {
        int arr[]={1,2,4,6,7,11};
        int target =10;

        HashSet<Integer> set = new HashSet<>();

        for(var x: arr)
          set.add(x);

        for(Integer x:set) {
          int d= target-x;
          if(set.contains(d)) {
            System.out.println("Pair found");
            return;
          }  
        }
        System.out.println("Not found");
    }
    
}
