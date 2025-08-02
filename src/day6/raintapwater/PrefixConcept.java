package day6.raintapwater;

public class PrefixConcept {
    public int trap(int[] height) {
       int [] prefixArray = prefixMax(height);
       int[] suffixArray = suffixMax(height);
       int size = height.length;
       int output =0;
        for (int i = 0; i < size; i++) {
            if(height[i]<prefixArray[i] && height[i]<suffixArray[i]){
                int m = prefixArray[i] ,n = suffixArray[i];
                output = Math.min(m,n) - height[i]+output;
            }
        }
        return output;
    }
    public int[] prefixMax(int[] nums){
        int size = nums.length;
        int[] prefixMax = new int[size];
        prefixMax[0] = nums[0];
        for (int i = 1; i < size; i++) {
            prefixMax[i] = Math.max(prefixMax[i-1],nums[i]);
        }

        return prefixMax;
    }
    public int[] suffixMax(int [] nums){
        int size = nums.length;
        int[] suffixMax = new int[size];
        suffixMax[size-1] = nums[size-1];
        for (int i = size-2; i >=0 ; i--) {
            suffixMax[i] = Math.max(suffixMax[i+1],nums[i]);
        }
        return suffixMax;
    }

    public static void main(String[] args) {
        PrefixConcept prefixConcept = new PrefixConcept();
        int result = prefixConcept.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        System.out.println("result = " + result);
    }
}
