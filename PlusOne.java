class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) { 
                digits[i]++;  // Just add 1
                return digits; // Done, return
            }
            digits[i] = 0; // 9 becomes 0, carry 1 to next
        }

        // If we reach here, all digits were 9
        int[] result = new int[n + 1];
        result[0] = 1; // e.g., 999 + 1 = 1000
        return result;
    }
}
public class PlusOne {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] digits = {9, 9, 9};

        int[] ans = sol.plusOne(digits);
        System.out.print("Result: ");
        for (int num : ans) {
            System.out.print(num);
        }
    }
}