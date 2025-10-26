//66. Plus One
class addone {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0;i--){
            if(digits[i]<9){   
                digits[i]+=1;
                return digits;  
            }
            digits[i]=0;   
        }
        int[] newDigits=new int[n+1];
        newDigits[0] = 1;  
        return newDigits;
    }
}
public class addoneTest{
    public static void main(String[] args) {
     int[] digits={1,2,3};
     addone a1=new addone();
      int[] result = a1.plusOne(digits); 
        System.out.print("Array after adding one: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    

    }
}