import java.util.Scanner;
class Binary {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
               System.out.println(target +" exists in nums and its  index is "+mid);
                return mid;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        
       return -1; 
    }
}
public class binarysearch {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the target = ");
         int target=Sc.nextInt();
        int[] nums={1,2,3,5,6,7};
        Binary b1=new Binary();
        int result=b1.search(nums,target);
        if (result==-1){
            System.out.println("target is not found");
        }

        Sc.close();

    }
}
