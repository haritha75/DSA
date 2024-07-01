public class ChangeTwoVariables {

    public static void main(String[] args) {
        
        int n = 10,n1=9;

        n = n^n1; //1 0 1 0
                  //1 0 0 1
                  //---------
                  //0 0 1 1 --3

        n1 = n^n1; //  0 0 1 1
                   //  1 0 0 1
                   //----------
                   //  1 0 1 0 -- 10


        n = n^n1; //  0 0 1 1
                  //  1 0 1 0
                  //----------
                  //  1 0 0 1 -- 9

        System.out.println(n+" "+n1);          
    }
    
}
