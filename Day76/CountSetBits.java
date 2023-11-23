public class CountSetBits {

    public static void main(String[] args) {
        
        int num =10;
        int count =0;

        while(num!=0) {

            if((num&1)!=0)
              count++;
            
            num = num>>1;  // here evey time we are updating the num value that means decreaseses half of the value.that means we not taken any mask always keep 1 in right side and after checking the condition then number  bit will be moved to right side that means removed.
            
            

            // 1 0 1 0
            // 0 0 0 1
            //--------
            //0 0 0 0 -- then  in 1 0 1 0 right side bit will be removed using >>.

            // 1 0 1 -- value 5 after using >> like this we are updating the value to 0 untill loop will be executed whenever value number will be 0 it comes out of loop
            // 0 0 1
            //------
            //0 0 1 -- again same proccess

        }
        System.out.println(count);
    }
    
}
