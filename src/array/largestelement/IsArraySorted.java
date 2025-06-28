package array.largestelement;

public class IsArraySorted {
    public  boolean isArraySorted(int [] array){
        for (int index = 0; index < array.length-1; index++) {
            if(array[index]>array[index+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        IsArraySorted isArraySorted = new IsArraySorted();
        boolean result = isArraySorted.isArraySorted(new int[]{1,3,4,5,6,7,2});
        System.out.println("result = " + result);
    }
}
