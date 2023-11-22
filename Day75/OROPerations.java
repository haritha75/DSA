// if you want to on the ith bit only then use bitwise or operations


public class OROPerations {

    public static void main(String[] args) {

        int num = 10; //  0 0 0 0 1 0 1 0 -- here integer have 8 bits 

        int i=4;
        int mask = 1<<i; // here we are using left shift and move to the 3rd position placing the 1

        System.out.println(num|mask);


        /*
         *  0 0 0 0 1 0 1 0
         *  0 0 0 1 0 0 0 0
         * ----------------
         *  0 0 0 1 1 0 1 0 -- here see only 4 th place will be only remaining all same 
         */
    }
}