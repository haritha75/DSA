import java.util.HashSet;

public class UnionIntersection {

    public static void main(String[] args) {
        
        int arr[]={2,5,7,9,11};
        int a[]={1,3,4,5,9};
        union(arr, a);
        System.out.println();
        intersection(arr, a);

    }

    public static void union(int arr[],int a[]) {

        HashSet<Integer> set = new HashSet<>();

        for(var x:arr)
          set.add(x);
        
        for(var x1:a) {
            if(!set.contains(x1))
              set.add(x1);
        }

        for(var c:set)
          System.out.print(c+" ");

    }

    public static void intersection(int arr[],int a[]) {

        HashSet<Integer> set1=new HashSet<>();
        for(var x2:arr)
          set1.add(x2);

        for(var x3:a) {
            if(set1.contains(x3))
              System.out.print(x3+" ");
        }
           


 }        
}
