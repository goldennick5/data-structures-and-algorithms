package algorithms;

public class PrefixSum {
  public int[] prefixSum;

  public PrefixSum(int[] nums) {
    //refering to nums; pointers
    prefixSum = nums;

    //starting from 1, because i - 1; if start from 0, it will go out of bounds
    for(int i = 1; i < nums.length; i++) {
      prefixSum[i] += prefixSum[i - 1];
    }
  }
    
  public int sumRange(int left, int right) {
    //if left equals 0, returning the sum of all numbers in array
    if(left == 0) return prefixSum[right];
    //returning the sum between the sum of all numbers and the sum from 0 till left - 1
    return prefixSum[right] - prefixSum[left - 1];  
  }

  public static void main(String[] args) {
    int[] nums = new int[]{-2, 0, 3, -5, 2, -1};
    PrefixSum pr = new PrefixSum(nums);
    System.out.println(pr.sumRange(2, 5));
  }
}


//if nums[0, 6] -> sum = nums[6] || nums[0, 1] + nums[2, 6];
//but if nums[2, 6] -> sum = nums[2, 6] - nums[0, 1];