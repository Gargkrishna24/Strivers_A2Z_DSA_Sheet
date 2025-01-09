
// User function Template for Java
package basicmaths;
public class LCMAndGCD {
    public static int lcmAndGCD(int a, int b){
        while(a>0 && b>0){
            if(a>b)a=a%b;
            else b=b%a;
        }
        if(a==0)return b;
        else return a;
    }

    public static int callcm(int a,int b){
        return (a*b)/ lcmAndGCD(a,b);
    }
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int lcm=callcm(a,b);
        int gcd= lcmAndGCD(a,b);
        return new int[]{lcm,gcd};

    }
}