package leetcode;

class Solution {
    public int maxProduct(int[] nums) {
        // Arrays.sort(nums);
        // return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
        int max1 = 0, max2 = 0;
        for(int n : nums) {
            //if n > max1, we assign previous max1 value to max2, and set newVal to max1
            if(n > max1) {
                max2 = max1;
                max1 = n;
            }
            //else if n < max1 but n > max2, we set max2 = n
            else if(n > max2) max2 = n;
        } 
        return (max1 - 1) * (max2 - 1);
    }  
}