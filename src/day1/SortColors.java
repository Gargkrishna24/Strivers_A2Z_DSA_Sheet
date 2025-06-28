package day1;

import java.util.Arrays;

public class SortColors {
    public static int[] sortColor(int[] nums) {
        int countOne = 0, countTwo = 0, countThree = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) countOne++;
            else if (nums[i] == 1) countTwo++;
            else countThree++;
        }
        for (int i = 0; i < countOne; i++) {
            nums[i] = 0;
        }
        for (int i = countOne; i < countOne + countTwo; i++) {
            nums[i] = 1;
        }
        for (int i = countTwo + countOne; i < nums.length; i++) {
            nums[i] = 2;
        }
        return nums;
    }
    public static void main(String[] args) {
        int [] colorsBalls = new int[]{1,2,0,2,1,0,2,1,2,1,0};
        int[] result = sortColor(colorsBalls);

        System.out.println("result = " + Arrays.toString(result));
    }
}
