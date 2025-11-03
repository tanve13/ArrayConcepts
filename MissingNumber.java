public class MissingNumber{
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};
        int sum = 0, n=arr.length+1, total;
        for(int i=0;i<arr.length;i++){
           sum += arr[i];
        }
        total =  (n * (n+1)/2)-sum;
        System.out.println("Missing Number is: "+total);
    }
}
//cam be done in this way also
 class MissingNumbers {

    static class Solution {
        public int missingNumber(int[] nums) {
            int n = nums.length;
            int expectedSum = n * (n + 1) / 2;
            int actualSum = 0;

            for (int num : nums) {
                actualSum += num;
            }

            return expectedSum - actualSum;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {3, 0, 1};
        int[] nums2 = {0, 1};
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println("Missing number in [3,0,1] → " + sol.missingNumber(nums1));
        System.out.println("Missing number in [0,1] → " + sol.missingNumber(nums2));
        System.out.println("Missing number in [9,6,4,2,3,5,7,0,1] → " + sol.missingNumber(nums3));
    }
}
