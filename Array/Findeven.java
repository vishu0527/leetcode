package Array;
class Even {
    public int findNumbers(int[] nums) {
        int count =0;  

        for (int num : nums) {
            int digits= 0;
            int temp = num;

            
            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }

           
            if (digits%2 == 0) {
                count++;
            }
        }

        return count;
    }
}
public class Findeven{
    public static void main(String[] args) {
        Even obj = new Even();
        int[] nums1 = {12, 345, 2, 6, 7896};
        System.out.println("Output 1: " + obj.findNumbers(nums1)); // 2

        int[] nums2 = {555, 901, 482, 1771};
        System.out.println("Output 2: " + obj.findNumbers(nums2)); // 1
      }
    }

