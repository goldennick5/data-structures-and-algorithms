package leetcode;

class Solution {
    public void moveZeroes(int[] nums) {
        int notZerosCnt = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[notZerosCnt++] = nums[i];
            }
        }
        for(int i = notZerosCnt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}