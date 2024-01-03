package leetcode;

class Solution {
  //bruit force solution
  public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    StringBuilder str_first = new StringBuilder();
    StringBuilder str_second = new StringBuilder();
    for (int i = 0; i < word1.length; i++) {
      String word = word1[i];
      str_first.append(word);
    }
    for (int i = 0; i < word2.length; i++) {
      String word = word2[i];
      str_second.append(word);
    }
    if (str_first.toString().equals(str_second.toString()))
      return true;
    return false;
  }
}
