package leetcode;

import java.util.Arrays;

class Solution {
  //time complexity O(n logn)
  public boolean isAnagram(String s, String t) {
    char[] tStr = t.toCharArray();
    Arrays.sort(tStr);
    char[] sStr = s.toCharArray();
    Arrays.sort(sStr);
    return Arrays.equals(tStr, sStr);
  }
}
