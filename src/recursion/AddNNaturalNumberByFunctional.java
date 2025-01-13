package recursion;

public class AddNNaturalNumberByFunctional {
    public static int addNNaturalNumberByFunctional(int i){
        if(i<1){
            return 0 ;
        }
        return i + addNNaturalNumberByFunctional(i-1);
    }
    public static void main(String[] args) {
        int n = addNNaturalNumberByFunctional(10);
        System.out.println("n = " + n);
    }
}
