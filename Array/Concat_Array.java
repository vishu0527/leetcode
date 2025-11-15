package Array;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n =nums.length;
        int[] ans = new int[2 * n];

        for(int i=0; i<n; i++) {
            ans[i]=nums[i];
            ans[i+n] =nums[i];
        }
        return ans;
    }
}


public class Concat_Array {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        Solution s1=new Solution();
        int[] result=s1.getConcatenation(nums);
        System.out.print("Concatenated Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
