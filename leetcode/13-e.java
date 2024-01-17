package leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int romanToInt(String s) {
    String symbols = "IVXLCDM";
    int[] symNums = new int[] { 1, 5, 10, 50, 100, 500, 1000 };
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < symbols.length(); i++) {
      map.put(symbols.charAt(i), symNums[i]);
    }
    int res = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      //we checking if i is less than last element, so we are not going out of bound
      //firstly it adds to res the last element, because in front of last is nothing, so res = s.length() - 1
      //than i--, it checks if i is less that i+1, in Roman numbers we subtract (i + 1) - i, line IV = I < V = V - I = 4
      if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
        res -= map.get(s.charAt(i));
      } else {
        res += map.get(s.charAt(i));
      }
    }
    return res;
  }
}
