class Solution {
    public int[] sortArray(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        // Find the largest and smallest elements in nums array
        for (int i=0;i<nums.length;i++) {
            largest = Math.max(largest, nums[i]);
            smallest = Math.min(smallest, nums[i]);
        }

        int range = largest - smallest + 1;
        int count[] = new int[range];

        // Update count array
        for (int i=0;i<nums.length;i++) {
            count[nums[i] - smallest]++;
        }

        int j = 0;

        // Reconstruct the sorted nums array
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                nums[j] = i + smallest;
                j++;
                count[i]--;
            }
        }

        return nums;
    }
}
