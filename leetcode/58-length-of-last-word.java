package leetcode;

class Solution {
    public int lengthOfLastWord(String s) {
        String[] result = s.trim().split(" ");
        return result[result.length - 1].length();
    }

    public static void main(String[] args) {
      Solution sol = new Solution();

      System.out.println(sol.lengthOfLastWord("   My name is Tokhtar   "));
    }
}
