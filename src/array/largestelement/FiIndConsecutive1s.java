package array.largestelement;

public class FiIndConsecutive1s {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count=0;
        for (int i = 0; i < n; i++) {
            if(nums[i]==1){
                count++;
            }
            else{
                break;
            }
        }
        return -1;
    }
}
