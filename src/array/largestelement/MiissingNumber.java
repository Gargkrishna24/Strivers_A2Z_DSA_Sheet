package array.largestelement;


class MissingNumber {
    public static int missingNumber(int[] nums){
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            int flag=0;
            for (int j = 0; j < n; j++) {
                if(nums[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag!=1){
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        int[] array = new int[]{0,1,3,4,5};
        int result = missingNumber(array);
        System.out.println("result = " + result);
    }
}
