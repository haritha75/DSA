import java.util.Stack;

public class InfixToPostfix {

    public static void main(String[] args) {
        
        String infix="((A+B)-C*(D/E))+F";
        String postFix=infixToPostfix(infix);
        System.out.println(postFix);

    }
    static String infixToPostfix(String infix) {
        Stack<Character> stack=new Stack<>();
        String res="";

        for(int i=0;i<infix.length();i++) {
            char ch=infix.charAt(i);

            if(Character.isLetter(ch)) {
                res +=ch;
            }
            else if(ch=='(') {
                stack.push(ch);
            }
            else if(ch==')') {
                 while (!stack.isEmpty() && stack.peek() != '(') {
                    res +=stack.pop();
                }
                 stack.pop();
            }
            else {
                
                    while(!stack.isEmpty() && precedence(ch)<=precedence(stack.peek())) {
                        res +=stack.pop();
                    }
                    stack.push(ch);
                }

           }

        while(!stack.isEmpty()) {
            res +=stack.pop();

        }
            return res.toString();
            }

            static int precedence(char ch){

                if(ch=='^')
                  return 3;
                else if(ch=='*' || ch=='/')
                  return 2;
                else if(ch=='+' || ch=='-')
                  return 1;
                return 0;      
            
           }

        }
    
