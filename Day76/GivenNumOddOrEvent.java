public class GivenNumOddOrEvent {

    public static void main(String[] args) {
        
        int n=9; // in binary form even always rightsetbit is 0 and odd number is 1.

        if((n&1)==0)
          System.out.println("even");
        else
          System.out.println("odd");  
    }
    
}
