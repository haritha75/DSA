public class AlternativeSeries {

    public static void main(String[] args) {
        
        int n = 10;
        

        int mask = n>>1;

        int res = (n^mask)+1;

        if((res & (res-1))==0)
          System.out.println("Yes");
        else
          System.out.println("No");  
    }
    
}
