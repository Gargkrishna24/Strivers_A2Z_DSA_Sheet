package day1;

import java.util.Arrays;

public class SortColorsUsingDutchNationalFlagAlgo {
    public static int[] sortColorsUsingDutchNationalFlagAlgo(int[] nums){
        int midPointer = 0;
        int lowPointer = 0;
        int highPointer = nums.length-1;
        for (int index = 0; index < nums.length; index++) {
            if(nums[midPointer]==0){
                int temp = nums[lowPointer];
                nums[lowPointer]=nums[midPointer];
                nums[midPointer]=temp;
                midPointer++;
                lowPointer++;
            }
            else if(nums[midPointer]==1){
                midPointer++;
            }
            else {
                int temp = nums[highPointer];
                nums[highPointer]=nums[midPointer];
                nums[midPointer]=temp;
               highPointer--;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int [] colorsBalls = new int[]{1,2,0,2,1,0,2,1,2,1,0};
        int[] result = sortColorsUsingDutchNationalFlagAlgo(colorsBalls);

        System.out.println("result = " + Arrays.toString(result));
    }
}
