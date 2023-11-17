class Solution {
    public int maxProduct(int[] nums) {

        int product = 1,s=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(product==0)
               product=1;
            if(s==0)
              s =1;   
            product *= nums[i];
            s *=nums[nums.length-1-i];
            max = Math.max(max,Math.max(product,s));
            

        }
        return max;
        
    }
}