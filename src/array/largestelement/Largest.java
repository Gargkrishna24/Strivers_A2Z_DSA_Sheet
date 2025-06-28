package array.largestelement;

public class Largest {
    public static int largestElement(int [] array ){
        int max = 0 ;
        for (int i = 1; i < array.length ; i++) {
            if(array[i]>array[max]){
                max=i;
            }
        }
        return array[max];
    }
    public static void main(String[] args){

        System.out.println(largestElement(new int[]{2,4,5,6,7,8,9}));
    }
}
