package greedyalgorithm.lemonandchange;

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0 ;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                ten++;
                if (five != 0) {
                    five--;
                } else return false;
            } else {
                if (five >= 3) {
                    five = five - 3;
                } else if (five != 0 && ten != 0) {
                    five--;
                    ten--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
