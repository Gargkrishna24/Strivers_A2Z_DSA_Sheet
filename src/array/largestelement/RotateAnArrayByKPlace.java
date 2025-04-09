package array.largestelement;

public class RotateAnArrayByKPlace {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] rotatedArray = new int[n];
        for (int i = 0; i <=k; i++) {
            int temp = nums[n-1];
            for (int j = 0; j < n-1; j++) {
                rotatedArray[j+1]=nums[j];
            }
            rotatedArray[0]=temp;
        }
    }
}
