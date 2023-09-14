import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {

        String str="[()]"; //([{}])
        System.out.println(isBalanced(str));
        
    }
    
    static boolean isBalanced(String str) {

        Stack<Character> stack=new Stack<>();

        for(var ch: str.toCharArray()) {

            if(isLeftBracket(ch))
              stack.push(ch);

            if(isRightBracket(ch))  {
               
                if(stack.empty())
                   return false;
                 var top=stack.pop();  
                if(!bractersMatches(ch, top))
                   return false;   
        }
      }
         return true;          
           
  }

  private static boolean isLeftBracket(char ch) {
      return ch=='(' || ch=='<' || ch=='{' || ch=='[';
  }
  private static boolean isRightBracket(char ch) {
    return ch==')' || ch=='>' || ch=='}' || ch==']';
  }

  private static boolean bractersMatches(char right,char left) {
    return !((right==')' && left!='(') || (right=='>' && left!='<') || (right=='}' && left!='{') || (right==']' && left!='[') );
  }
}

