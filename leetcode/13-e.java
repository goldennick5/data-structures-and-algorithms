package leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int romanToInt(String s) {
    String romansString = "IVXLCDM";
    int[] values = new int[] { 1, 5, 10, 50, 100, 500, 1000 };

    Map<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < romansString.length(); i++) {
      map.put(romansString.charAt(i), values[i]);
    }
    int res = 0;

    for (int i = s.length() - 1; i >= 0; i--) {
      int curVal = map.get(s.charAt(i));
      if (i < s.length() - 1 && curVal < map.get(s.charAt(i + 1))) {
        res -= curVal;
      } else {
        res += curVal;
      }
    }
    return res;
  }
}
