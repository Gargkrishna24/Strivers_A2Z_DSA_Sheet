package array.largestelement;

public class CheckIfArrayIsSortedAndRotated {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        if(nums[0]<nums[n-1]) count++;
        for(int index = 0 ; index<n-1;index++){
            if(nums[index]>nums[index+1]) count++;
            if(count>1) return false;
        }
        return true;
    }
}
