package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = new Solution().twoSum(new int[]{2, 7, 11, 15}, 9);

        for (int elem: arr){
            System.out.println(elem);
        }
    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i< numbers.length; i++){
            int comp = target - numbers[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp), i+1};
            }
            map.put(numbers[i], i+1);
        }

        return new int[]{};
    }
}
