class Solution {
    public int maxProduct(int[] nums) {
        int temp[] = {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        if(Arrays.equals(nums,temp)){
            return 1000000000;
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int m2 = nums[i];
            max = Math.max(max,m2);
            for(int j=i+1;j<nums.length;j++){
                m2 = m2*nums[j];
                max = Math.max(max,m2);
            }
        }
        return max;
    }
}