public class ConvertDEcToBinary {

    public static void main(String[] args) {
        
        int a=10;
        String str="";

        while(a>=1) {

            int rem = a%2;
            a=a/2;
            str =rem+str;

        }
        System.out.println(str);
    }
    
}
