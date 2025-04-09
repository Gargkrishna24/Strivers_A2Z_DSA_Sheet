package array.largestelement;
public class SecondLargest {
    public static int getSecondLargest(int[] arr) {
        int maxElement = arr[0] ;
        int slargestElement = Integer.MIN_VALUE;
        for (int index = 0; index < arr.length; index++) {
            if(maxElement<arr[index]){
                maxElement = arr[index];
            }
        }
        for (int index = 0; index <arr.length; index++) {
            if(arr[index]>slargestElement && arr[index]<maxElement){
                slargestElement = arr[index];
            }

        }
    return slargestElement;
    }
    public static void main(String[] args) {
        int[] array = new int[]{8,4,1};
        System.out.println(getSecondLargest(array));
    }
}
