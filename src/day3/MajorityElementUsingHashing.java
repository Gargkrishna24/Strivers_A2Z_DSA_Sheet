package day3;

import java.util.HashMap;

public class MajorityElementUsingHashing {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majorityCount = nums.length / 2;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > majorityCount) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MajorityElementUsingHashing majorityElementUsingHashing = new MajorityElementUsingHashing();
        int result = majorityElementUsingHashing.majorityElement(new int[]{2, 2, 3, 3, 1, 2, 2});
        System.out.println("result = " + result);
    }
}
