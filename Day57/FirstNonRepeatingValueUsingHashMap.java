import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingValueUsingHashMap {

    public static void main(String[] args) {

        System.out.println(nonReatingCharacter("hello world"));
        
    }

    public static char nonReatingCharacter(String str) {

        Map<Character,Integer> map=new HashMap<>();

        for(var ch : str.toCharArray()) {
            if(!map.containsKey(ch)) 
                map.put(ch,1);
            else {
                int previous=map.get(ch);
                map.put(ch,previous+1);
            }    

        }

        for(var x:str.toCharArray()) {
            if(map.get(x)==1)
              return x;
        }

        return Character.MIN_VALUE;

    }
}