package array.largestelement;

 class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index++] = nums[i];
            }
        }
        return index;  // New length
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 3, 3, 4};
        int len1 = removeDuplicates(arr1);
        for (int i = 0; i < len1; i++) System.out.print(arr1[i] + " "); // 1 2 3 4
        System.out.println();
        int[] arr2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(arr2);
        for (int i = 0; i < len2; i++) System.out.print(arr2[i] + " "); // 0 1 2 3 4
    }
}