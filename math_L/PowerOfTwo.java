//231. Power of Two
package math_L;
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        while (n%2==0) {
            n/=2;
        }
        return n==1;
    }
}
public class PowerOfTwo {
    public static void main(String[]args) {
        Solution s = new Solution();

        int n1=1;
        int n2=16;
        int n3=3;

        System.out.println(n1+"-"+s.isPowerOfTwo(n1));
        System.out.println(n2+"-"+s.isPowerOfTwo(n2));
        System.out.println(n3+"-"+s.isPowerOfTwo(n3)); 
    }
}
