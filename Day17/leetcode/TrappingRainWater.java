class TrappingRainWater {
    public int trap(int[] height) {
        int totWater=0;
        for(int i=1;i<height.length-1;i++) {
            int leftMax=height[i];
            for(int j=0;j<i;j++) {
                if(height[j]>leftMax)
                leftMax=height[j];
            }
            int rightMax=height[i];
            for(int k=i+1;k<height.length;k++) {
                if(height[k]>rightMax)
                rightMax=height[k];
            }

            int min=Math.min(leftMax,rightMax);
            int water=min-height[i];
            totWater+=water;

        }

        
        return totWater;
    }
}
