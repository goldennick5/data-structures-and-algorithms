package leetcode;

class Solution {
  public int numJewelsInStones(String jewels, String stones) {
    int counter = 0;
    for (char stone : stones.toCharArray()) {
      if (jewels.indexOf(stone) > -1)
        counter++;
    }
    return counter;
  }
}
