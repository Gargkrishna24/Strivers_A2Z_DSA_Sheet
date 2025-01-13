package recursion;

 class PrintNumberFromNToOneByBacktracking {
    public static void printNUmberFromOneToNByBacktracking(int i , int n ) {
        if(i>n)return;
        printNUmberFromOneToNByBacktracking(i+1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        printNUmberFromOneToNByBacktracking(1,10);
    }
}
