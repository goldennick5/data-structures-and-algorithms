package leetcode;

class Solution {
  // ultra super mega gega solution
  public int mostWordsFound(String[] sentences) {
    int[] res = new int[sentences.length];
    int max = 0;
    for (int i = 0; i < sentences.length; i++) {
      String[] wordArr = sentences[i].trim().split(" ");
      res[i] = wordArr.length;
    }
    for (int i = 0; i < res.length; i++) {
      if (max < res[i]) {
        max = res[i];
      }
    }
    return max;
  }

  // more better solution
  public int mostWordsFoundSec(String[] sentences) {
    int max = 0;
    for (String s : sentences) {
      int wordLen = s.trim().split(" ").length;
      if (max < wordLen)
        max = wordLen;
    }
    return max;
  }
}
