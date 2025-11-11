public class FindPeakElement {

    static class Solution {
        public int findPeakElement(int[] nums) {
            int n = nums.length;
            for (int i = 0; i < n - 1; i++) {
                if (nums[i] > nums[i + 1]) return i;
            }
            return n - 1; 
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};

        System.out.println("Peak index (nums1): " + sol.findPeakElement(nums1));
        System.out.println("Peak index (nums2): " + sol.findPeakElement(nums2));
    }
}
