class Solution {
    public void moveZeroes(int[] nums) {
        int p = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[p++] = nums[i];
            }
        }
        while(p < nums.length){
            nums[p++] = 0;
        }
    }
}
public class MoveZeroes{
     public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {0, 1, 0, 3, 12};

       

        System.out.println(sol.moveZeroes(nums));

        
    }
}