import java.util.HashMap;

public class SampleEquation {

    public static void main(String[] args) {
        
        int arr[] ={3,4,7,1,2,9,8};

        HashMap<Integer,int[]> map=new HashMap<>();


        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {

                int sum=arr[i]+arr[j];

                if(!map.containsKey(sum)) {
                    int a[]={arr[i],arr[j]};
                    map.put(sum,a);

                }

                else {

                    System.out.print("("+arr[i]+" "+arr[j]+"),");
                    int a1[]=map.get(sum);
                    System.out.println("("+a1[0]+" "+a1[1]+")");

                }
            }
        }
    }
    
    
}
