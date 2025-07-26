
import java.lang.Math;

public class MaxProdSubArray{
    protected static int solution(int[] nums){
        if(nums.length == 0) return 0;

        int max = nums[0];
        int min = nums[0];
        int res = nums[0];

        for(int i = 1; i< nums.length; i++){
            int tempMax = max;
            int tempMin = min;

            max = Math.max(nums[i], Math.max(nums[i] * tempMax, nums[i] * tempMin));
            min = Math.min(nums[i], Math.min(nums[i] * tempMax, nums[i] * tempMin));

            res = Math.max(res, max);
        }

        return res;
    }

    public static void main(String []args){
        int[] nums = {-1, -2, -9, -6};

        System.out.println(solution(nums));
    }
}