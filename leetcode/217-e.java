package leetcode;

import java.util.HashSet;

class Solution {
  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> res = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (!res.contains(nums[i])) {
        res.add(nums[i]);
      } else
        return true;
    }
    return false;
  }
}
