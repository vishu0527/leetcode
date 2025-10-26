//8. Remove Duplicates from Sorted Array
class Rmduplicate {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }
}
public class removeduplicates{
    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,3,4};
    Rmduplicate r1=new Rmduplicate();
     int result=r1.removeDuplicates(nums);
      System.out.println("Number of unique elements: " + result);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");

    }
}
}