class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++) {
            if(!(map.containsKey(nums[i]))) {
                map.put(nums[i],1);

            }
            else {
                int previous= map.get(nums[i]);
                count +=previous;
                map.put(nums[i],previous+1);
            }
        }
        return count;
        
    }
}
