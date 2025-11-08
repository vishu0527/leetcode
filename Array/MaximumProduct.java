import java.util.Arrays;
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums); 
        int n = nums.length;

        int product1 = nums[n-1] * nums[n-2] * nums[n-3];
        int product2 = nums[0] * nums[1] * nums[n-1];

        return Math.max(product1, product2);
    }
}

public class MaximumProduct {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-10, -10, 1, 3, 2};
        int result = s.maximumProduct(nums);
        System.out.println("Maximum Product of Three Numbers: " + result);
    }
}
