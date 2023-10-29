import java.util.HashMap;

public class CanFormPalindrome {

    public static void main(String[] args) {
        
        String str= "civiv";

        System.out.println(palindrime(str));

        
    }

    public static boolean palindrime(String str) {

        HashMap<Character,Integer> map=new HashMap<>();

        char[] arr = str.toCharArray();

        for(var x: arr) {
            if(!map.containsKey(x))
              map.put(x,1);
            else {
              int previous= map.get(x);
              map.put(x,previous+1);
            }

        }
        int count=0;

        for(var x:map.entrySet()) {

            if(x.getValue() %2!=0) 
              count++;
            
        }
        if(count==1 || count==0)
           return true;
        else 
          return false;   
    }
    
}
