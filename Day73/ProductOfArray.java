class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int a[]=new int[n];

        if(n<1)
          return a;
        int product =1;
        for(int i=0;i<n;i++) {
            product *= nums[i];
            a[i]=product;

        }  
        product =1;
        for(int i=n-1;i>0;i--) {
            a[i]=product*a[i-1];
            product *=nums[i];

        }
        a[0]=product;
        return a;
       
        
    }
}