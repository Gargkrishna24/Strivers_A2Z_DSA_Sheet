package array.largestelement;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0 ;
        for (int index = 0; index < n-1; index++) {
            if(nums[index]!=nums[index+1]) k++;
        }
        for (int index = 0; index <= k; index++) {
            
        }
        return k;
    }

    public static void main(String[] args) {
        int[] array = new int[]{0,0,1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,5};
        int result = removeDuplicates(array);
        System.out.println("result = " + result);
    }

}
