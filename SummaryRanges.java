import java.util.*;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) return res;

        int start = nums[0];

        for (int i = 1; i <= nums.length; i++) {
            // check if range ended
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1])
                    res.add(String.valueOf(start));       // single number
                else
                    res.add(start + "->" + nums[i - 1]);  // range

                if (i < nums.length) start = nums[i];     // start new range
            }
        }

        return res;
    }

    public static void main(String[] args) {
        SummaryRanges sol = new SummaryRanges();

        int[] nums1 = {0, 1, 2, 4, 5, 7};
        int[] nums2 = {0, 2, 3, 4, 6, 8, 9};

        System.out.println(sol.summaryRanges(nums1)); // Output: [0->2, 4->5, 7]
        System.out.println(sol.summaryRanges(nums2)); // Output: [0, 2->4, 6, 8->9]
    }
}
