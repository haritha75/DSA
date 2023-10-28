import java.util.HashSet;

public class commonValue {

    public static void main(String[] args) {
        int arr[]={2,5,7,1};
        int a[]={8,4,2,11};

        sameValue(arr,a);
    }

    public static void sameValue(int arr[],int a[]) {

        HashSet<Integer> set=new HashSet<>();

        for(var x:arr)
            set.add(x);
        boolean flag=true;
        for(int i=0;i<a.length;i++) {

            if(set.contains(a[i])) {
                flag=false;
              System.out.print(a[i]+" ");
        }
        }   
        
        if(flag==true)
           System.out.println("their is no common value");
    }
    
}
