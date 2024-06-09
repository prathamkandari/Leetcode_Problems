class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        int outarr[] = new int[nums.length];
        left[0] = nums[0];
        right[right.length-1]=nums[nums.length-1];
        for(int i=1; i<left.length; i++){
            left[i] = nums[i] * left[i-1];
        }
        for(int i=right.length-2; i>=0; i--){
            right[i] = nums[i] * right[i+1];
        }
        outarr[0] = right[1];
        outarr[outarr.length-1] = left[left.length -2];
        for(int i=1; i<outarr.length-1; i++){
            outarr[i] = left[i-1] * right[i+1];
        }
        return outarr;
    }
}