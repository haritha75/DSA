import java.util.HashMap;

public class MostFrequentWord {

    public static void main(String[] args) {
        
        String str="hi everyone say hi to all";
        frequentWord(str);
    }

    public static void frequentWord(String str) {

        String arr[]=str.split(" ");

        HashMap<String,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++) {
            if(!map.containsKey(arr[i]))
                 map.put(arr[i],1);
            else {

                int previous=map.get(arr[i]);
                map.put(arr[i],previous+1);
            }  
        }

        int max=Integer.MIN_VALUE;
        String frequenWord="";

        for(var x:map.entrySet()) {
            if(x.getValue()>max) {
              max=x.getValue();
              frequenWord = x.getKey();
            }
        }

        System.out.println(max+" "+frequenWord);

    }
    
}
