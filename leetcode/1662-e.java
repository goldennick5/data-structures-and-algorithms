package leetcode;

class Solution {
  public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    StringBuilder str_first = new StringBuilder();
    StringBuilder str_second = new StringBuilder();
    for (int i = 0; i < word1.length; i++) {
      str_first.append(word1[i]);
    }
    for (int i = 0; i < word2.length; i++) {
      str_second.append(word2[i]);
    }
    return str_first.compareTo(str_second) == 0;
  }
}
