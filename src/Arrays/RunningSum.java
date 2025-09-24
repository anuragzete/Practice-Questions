	class RunningSum {

    public int[] runningSum(int[] nums) {
        // sol 1 :
        // int[] res = new int[nums.length];
        // for(int i= 0; i < nums.length; i++){
        //     int sum = 0;
        //     for(int j= 0; j<= i; j++){
        //         sum += nums[j];
        //     }
        //     res[i] = sum;
        // }
        // return res;

        // sol 2 :
        for(int i= 1; i< nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;

        // // sol 3 :
        // helperMethod(nums, 1);
        // return nums;
    }
    
    // public void helperMethod(int[] nums, int idx){
    //     if(idx >= nums.length) return;
    //     nums[idx] = nums[idx] + nums[idx -1];
    //     helperMethod(nums, idx +1);
    // }
  }
