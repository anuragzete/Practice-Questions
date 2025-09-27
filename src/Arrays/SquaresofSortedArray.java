class Solution {
    public int[] sortedSquares(int[] nums) {
        int arrLen = nums.length;
        int[] res = new int[arrLen];
        int leftPtr = 0, rightPtr = arrLen - 1;
        int currPos = arrLen - 1;

        while (leftPtr <= rightPtr) {
            int leftSqr = nums[leftPtr] * nums[leftPtr];
            int rightSqr = nums[rightPtr] * nums[rightPtr];
            if (leftSqr > rightSqr) {
                res[currPos--] = leftSqr;
                leftPtr++;
            } else {
                res[currPos--] = rightSqr;
                rightPtr--;
            }
        }

        return res;
    }
}