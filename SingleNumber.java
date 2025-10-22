public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;  // XOR all numbers
        }
        return result;
    }

    // Test the function
    public static void main(String[] args) {
        SingleNumber sol = new SingleNumber();

        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        System.out.println(sol.singleNumber(nums1)); // 1
        System.out.println(sol.singleNumber(nums2)); // 4
        System.out.println(sol.singleNumber(nums3)); // 1
    }
}
