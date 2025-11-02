import java.util.*;

class Squrt {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        int left = 1, right = x / 2, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {
                ans = mid;      
                left = mid + 1;    
            } else {
                right = mid - 1;   
            }
        }

        return ans; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int x = sc.nextInt();

         Squrt sol = new Squrt();
        int result = sol.mySqrt(x);

        System.out.println("Square root (integer part): " + result);
        sc.close();
    }
}
