package twodarray;

public class SetMatrixZero
{
    public void setZeroes(int[][] matrix) 
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==0){
                    setColumn(matrix , j);
                    setRow(matrix,i);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public void setRow(int[][] matrix ,int i){
        for (int j = 0; j < matrix[i].length; j++) {
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
    }
    public void setColumn(int[][] matrix , int j ){
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
    }
}
class Main{
    public static void main(String[] args) {
        SetMatrixZero setMatrixZero = new SetMatrixZero();
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        setMatrixZero.setZeroes(matrix);

    }
}