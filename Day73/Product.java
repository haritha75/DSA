/*
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int a[]=new int[n];

        for(int i=0;i<n;i++) {
            int product=1;
            for(int j=0;j<n;j++) {
                if(i!=j)
                  product *=nums[j];
            }
            a[i]=product;
        }
        return a;
        
    }
}