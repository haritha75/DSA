class ConcatinationOfArray {
    public int[] getConcatenation(int[] nums) {

        int n=nums.length;
        int a[]=new int[2*n];
        for(int i=0;i<n;i++) {
            a[i]=nums[i];
        }
        for(int i=0;i<n;i++) {
            a[i+n]=nums[i];
        }
        return a;
        
    }
}
