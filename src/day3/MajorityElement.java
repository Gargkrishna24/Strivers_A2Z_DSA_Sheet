package day3;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        for (int index = 0 ; index< size-1 ; index++){
            int tempCount = 1;
            for (int i = index+1; i < size; i++) {
                if(nums[i]==nums[index]) {
                    tempCount++;
                }
            }
            if(tempCount > size/2) return nums[index];
        }
        return -1;
    }

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int result = majorityElement.majorityElement(new int[]{2,2,3,3,1,2,2});
        System.out.println("result = " + result);
    }
}
