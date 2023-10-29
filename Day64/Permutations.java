public class Permutations {

    public static void main(String[] args) {
        
        String str="abcd";
        int n=2;

        System.out.println(countPairs(str,n));
    }

    public static  int countPairs(String str,int n) {

        char[] arr=str.toCharArray();

        int p= factorial(arr.length);
        int com=factorial(arr.length-n);

        return p/com;
    }

    public static int factorial(int n) {

        int fact=1,i;

        for(i=2;i<=n;i++) {

            fact *=i;
        }
        return fact;

    }
    
}
