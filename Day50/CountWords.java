public class CountWords {
    public static void main(String[] args) {
        
        String str="hello    everyone say ";
             int count=0;
        for(int i=0;i<str.length()-1;i++) {

            if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') 
            count++;
        }
        if(str.charAt(0)==' ')
          System.out.println(count-1);
        else 
          System.out.println(count+1);  
    }
    
}
