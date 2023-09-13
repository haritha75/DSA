import java.util.Stack;

import javax.xml.stream.events.Characters;

public class ReversingArrayUsingStack {

    public static void main(String[] args) {
        
        String str="hello";

        String rev=Reversing.reverseStr(str);
        System.out.println(rev);
    }
    
}

class Reversing {

   
    public static String reverseStr(String str) {

        if(str ==null)
          throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();

        for(var x:str.toCharArray())
           stack.push(x);

        StringBuffer newStr = new StringBuffer();
        
        while(!stack.isEmpty())
           newStr.append(stack.pop());

        return newStr.toString();   
    }
}