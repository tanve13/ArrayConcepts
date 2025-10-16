class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n != nums[i - 2]) {
                nums[i] = n;
                i++;
            }
        }
        return i;
    }
}

public class RemoveDuplicateFromSortedArrayTwo {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,1,1,2,2,3};
        int len = sol.removeDuplicates(nums);
        System.out.println("Length: " + len);
        System.out.print("Modified Array: ");
        for (int i = 0; i < len; i++) System.out.print(nums[i] + " ");
    }
}
