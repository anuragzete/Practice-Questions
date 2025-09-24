class ArrayFromPermutation {
    // public int[] buildArray(int[] nums) {
    //     int[] res = new int [nums.length];
    //     for(int i= 0; i< nums.length; i++){
    //         res[i] = nums[nums[i]];
    //     }
    //     return res;
    // }
    
    static{
        for(int k=0;k<1;k++)
            buildArray(new int[0]);
    }
    public static int[] buildArray(int[] nums) {
        int [] res = new int [nums.length];
        for (int v =0;v<nums.length;v++)
            res[v] = nums[nums[v]];
        return res;
    }
}
