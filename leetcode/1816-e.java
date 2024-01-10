package leetcode;

class Solution {
  public String truncateSentence(String s, int k) {
    String[] truncatedStr = s.split(" ");
    String[] res = new String[k];
    for (int j = 0; j < k; j++) {
      res[j] = truncatedStr[j];
    }
    return String.join(" ", res);
  }
}


//js solution easy peasy lemon sq

// var truncateSentence = function(s, k) {
//     return s.split(" ").slice(0, k).join(" ");
// };