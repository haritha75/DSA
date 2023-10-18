import java.util.HashMap;
import java.util.Map;

public class firstNonRepeatingUsingHashMap {
    public static void main(String[] args) {
        char res = firstNonRepeatingCharacter("rock the world");
        System.out.println(res);
        
    }
    public static char firstNonRepeatingCharacter(String str){
        Map<Character,Integer> map = new HashMap<>();
        for(var ch:str.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else {
                int count = map.get(ch);
                map.put(ch,count+1);
            }
        }
        for(var ch : str.toCharArray()){
            if(map.get(ch)==1)
                return ch;
        }
        return Character.MIN_VALUE;
    }
}