/**9. Palindrome Number
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Constraints:
-231 <= x <= 231 - 1 **/


//solution
import java.util.Scanner;
class palindrome {
    public boolean isPalindrome(int x) {
        String str=x+"";
        int left=0;
        int right= str.length()-1;
        
           while(left<=right){
               if(str.charAt(left)!=str.charAt(right)){
                   return false;
                }
               else{
                  left++;
                  right--;
               }

            }
       return true; 
    }
}
public class palindromeTest{
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the num to check palindrom = ");
        int x=Sc.nextInt();
        palindrome p1=new palindrome();
        boolean result=p1.isPalindrome( x); 
        if(result==true){
            System.out.println("The Entered num is palindrome ");
        }
        else{
            System.out.println("The Entered num is not palindrome");
        }

        Sc.close();
    }
}