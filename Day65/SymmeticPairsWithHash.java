import java.util.HashMap;

public class SymmeticPairsWithHash {

    public static void main(String[] args) {

        int arr[][]=new int[5][2];

        arr[0][0] = 11;
        arr[0][1] = 20;
        arr[1][0] = 30;
        arr[1][1] = 40;
        arr[2][0] = 5;
        arr[2][1] = 10;
        arr[3][0] = 40;
        arr[3][1] = 30;
        arr[4][0] = 10;
        arr[4][1] = 5;


        HashMap<Integer,Integer> map=new HashMap<>();


        for(int i=0;i<arr.length;i++) {

            int firstVal=arr[i][0];
            int secondVal=arr[i][1];

            Integer value=map.get(secondVal);

            if(value!=null&& value ==firstVal) {
                System.out.println("("+secondVal+","+firstVal+")");
                
            }
            else 
                map.put(firstVal,secondVal);

        }
        
    }
    
}
