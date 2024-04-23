public class ConvertBinaryToDEcimal {

    public static void main(String[] args) {
        

        String str = "1010";
        int res=0;
        int n=str.length();
        
        for(int i=n-1;i>=0;i--) {
           if(str.charAt(n-i-1)=='1')
               res += (int)Math.pow(2,i);

        }
        System.out.println(res);
    }
    
}
