class GoodPairCount {
    public int numIdenticalPairs(int[] nums) {
        // sol 1 (brute-force)
        // Time - O(n^2) & Space - O(1)

        // int pairCount = 0;
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i; j < nums.length; j++){
        //         if((i < j) && (nums[i] == nums[j])){
        //             pairCount++;
        //         }
        //     }
        // }

        // return pairCount;

        // sol 2 (single iteration and hashmap)
        // Time - O(n) & Space - O(n)

        if(nums.length == 1) return 0;

        int pairCount = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            int count = freqMap.getOrDefault(num, 0);
            pairCount += count;
            freqMap.put(num, count + 1);
        }

        return pairCount;
    }
}
