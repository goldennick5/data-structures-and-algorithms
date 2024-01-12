package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
  public List<List<Integer>> groupThePeople(int[] groupSizes) {
    HashMap<Integer, List<Integer>> map = new HashMap<>();
    List<List<Integer>> res = new ArrayList<>();

    for (int i = 0; i < groupSizes.length; i++) {
      int size = groupSizes[i];
      if (!map.containsKey(size)) {
        map.put(size, new ArrayList<>());
      }
      map.get(size).add(i);
      if (map.get(size).size() == size) {
        res.add(map.get(size));
        map.remove(size);
      }
    }
    return res;
  }
}