class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int duplicate = 0;
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                duplicate = nums[i];
            }
            else{
                set.add(nums[i]);
            }
        }
        return duplicate;
    }
}