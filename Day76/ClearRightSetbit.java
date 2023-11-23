public class ClearRightSetbit {

    public static void main(String[] args) {
        int n = 10; // 1 0 1 0

        System.out.println(n & (n-1)); // 1 0 1 0 -- here we donot know in whic places right set bit will have for that purpose we can use like  this formula.
                                       // 1 0 0 1
                                       //---------
                                       // 1 0 0 0 -- see here right most set bit will be off.

    }
    
}
