public class MethodTimeComplxity {
    public static void main(String[] args) {
        
    }
    void hello() {
        hi();

    }
    void hi(){
        int n=10;
        for(int i=0;i<n;i++)
          System.out.println(i);
    }
    
}
/* 
 here, hello method iterate n times because we are calling hi method so hi method will run n times.
 hello method time complexity is O(n).

 */
