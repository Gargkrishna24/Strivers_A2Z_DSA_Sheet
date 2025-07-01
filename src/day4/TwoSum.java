package day4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums , int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        // Return an empty array if no solution is found
        return new int[]{};
    }


    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int [] result = twoSum.twoSum(new int[]{2,4,5,6,7,10},10);
        System.out.println("result = " + Arrays.toString(result));
    }
}
