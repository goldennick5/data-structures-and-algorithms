package leetcode;

class NumArray {
    int[] nums = null;

    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i = left; i <= right; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
      NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
      System.out.println(numArray.sumRange(0, 2)); // return (-2) + 0 + 3 = 1
      System.out.println(numArray.sumRange(2, 5)); // return 3 + (-5) + 2 + (-1) = -1
      System.out.println(numArray.sumRange(0, 5)); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
    }
}

