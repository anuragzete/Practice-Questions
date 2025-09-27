class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // sol 1 (brute-force)
        // Time complexity - O(n^2)
        // Space complexity - O(n)

        // int[] res = new int[nums.length];

        // for(int i=0; i<nums.length; i++){
        //     int count = 0;
        //     for(int j=0; j< nums.length;j++){
        //         if(nums[j] < nums[i]) count++;
        //     }
        //     res[i] = count;
        // }

        // return res;

        // sol 2 (prefix sum)
        // Time complexity - O(n+k)
        // Space complexity - O(n+k)

        int[] freqCount = new int[101];
        int[] prefixSum = new int[101];
        int[] res = new int[nums.length];

        for(int i=0; i< nums.length; i++){
            freqCount[nums[i]]++;
        }

        for(int i=0; i< freqCount.length; i++){
            prefixSum[i] = freqCount[i];
        }

        for(int i=1; i< freqCount.length; i++){
            prefixSum[i] += prefixSum[i-1]; 
        }

        for(int i=0; i< res.length; i++){
            res[i] = nums[i] == 0?0:prefixSum[nums[i] -1];
        }

        return res;
    }
}