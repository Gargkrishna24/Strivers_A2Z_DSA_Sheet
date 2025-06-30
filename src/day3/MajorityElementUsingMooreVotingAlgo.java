package day3;

public class MajorityElementUsingMooreVotingAlgo {
    public int majorityElement(int [] nums){
        int count = 0 , candidate = 0 ;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            count+=candidate==num?1:-1;
        }
    return candidate;
    }

    public static void main(String[] args) {
        MajorityElementUsingMooreVotingAlgo majorityElementUsingMooreVotingAlgo = new MajorityElementUsingMooreVotingAlgo();
        int result = majorityElementUsingMooreVotingAlgo.majorityElement(new int[]{2,2,3,3,1,2,2});
        System.out.println("result = " + result);
    }
}
