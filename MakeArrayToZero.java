class MakeArrayToZero {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int result = 0;

        // Try every position that starts with zero
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) continue;

            // Two directions: right (+1) and left (-1)
            for (int dir : new int[]{1, -1}) {
                int[] arr = nums.clone();
                int curr = i;
                int d = dir;

                while (curr >= 0 && curr < n) {
                    if (arr[curr] == 0) {
                        curr += d;
                    } else {
                        arr[curr]--;
                        d = -d; // reverse direction
                        curr += d;
                    }
                }

                // check if all elements are zero
                boolean allZero = true;
                for (int x : arr) {
                    if (x != 0) {
                        allZero = false;
                        break;
                    }
                }

                if (allZero) result++;
            }
        }

        return result;
    }

    // Example usage
    public static void main(String[] args) {
        MakeArrayToZero mk = new MakeArrayToZero();
        int[] nums = {1, 0, 2, 0, 3};
        System.out.println(mk.countValidSelections(nums)); // Output: 2
    }
}
