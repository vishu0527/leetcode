package Array;
import java.util.*;
class Solution {

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            ans[j++] = nums[i];
            ans[j++] = nums[i + n];
        }

        return ans;
    }
}
    public class Shuffle_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[2 * n];

        System.out.println("Enter " + (2 * n) + " elements:");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int[] result = obj.shuffle(nums, n);

        System.out.println("Shuffled Array:");
        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
