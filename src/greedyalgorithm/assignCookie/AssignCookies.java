package greedyalgorithm.assignCookie;
import java.util.Arrays;
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n = g.length;
        int m = s.length;
        int lower = 0;
        int higher = 0;
        while(lower<m && higher<n){
            if(s[lower]>=g[higher]){
                higher++;
            }
            lower++;
        }
        return higher;
    }
}
