package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  //super duper slow complex code that i could make easier, but it is what it is
  public int thirdMax(int[] nums) {
    List<Integer> res = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      if (!res.contains(nums[i])) {
        res.add(nums[i]);
      }
    }
    int thirdMax = 0;
    if (res.size() >= 3)
      thirdMax = res.get(res.size() - 3);
    else if (res.size() == 2)
      thirdMax = res.get(1);
    else
      thirdMax = res.get(0);
    return thirdMax;
  }
}
