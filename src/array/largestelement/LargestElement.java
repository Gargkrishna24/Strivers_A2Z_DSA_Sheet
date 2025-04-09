package array.largestelement;

public class LargestElement {
    public  int largest(int[] arr) {
        int maxElement = arr[0];
        for(int index = 1 ; index<arr.length-1; index++){
            if(maxElement<arr[index]){
                maxElement=index;
            }
        }
       return maxElement;
    }
}
class Main{
    public static void main(String[] args) {
        LargestElement largestElement = new LargestElement();
        int[] array = new int[]{8,4,1};
        System.out.println(largestElement.largest(array));
    }
}