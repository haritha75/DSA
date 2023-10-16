import java.util.HashSet;
import java.util.Set;

public class FirstRepeatCharacterUsingHashSet {

    public static void main(String[] args) {

        System.out.println(firstReatingChar("hello"));
        
    }

    public static char firstReatingChar(String str) {

        Set<Character> set = new HashSet<>();

        for(var x: str.toCharArray()) {
            if(!set.contains(x))
                 set.add(x);
            else 

                return x;  
     
        }
        
        return Character.MIN_VALUE;
    }
    
}
