package recursion;

public class AddNNaturalNumberByParameterised {
    public static  void addNNaturalNumberByParameterised(int i , int sum ){
        if(i<1){
            System.out.println(sum);
            return;
        }
        addNNaturalNumberByParameterised(i-1,sum+i);

    }

    public static void main(String[] args) {
        addNNaturalNumberByParameterised(10,0);
    }
}
