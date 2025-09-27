class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 0) return 0;
        // sol 1 (iterater)
        // Time - O(n) space - O(1)

        int count = 0;
        int maxCount = 0;
        for(int num: nums){
            count = (num == 0) ? 0 : count + 1;
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}