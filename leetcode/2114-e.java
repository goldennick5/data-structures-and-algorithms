package leetcode;

class Solution {
    public int mostWordsFound(String[] sentences) {
        int[] res = new int[sentences.length];
        int max = 0;
        for(int i = 0; i < sentences.length; i++) {
            String[] wordArr = sentences[i].trim().split(" ");
            res[i] = wordArr.length;
        }
        for(int i = 0; i < res.length; i++) {
            if(max < res[i]) {
                max = res[i];
            }
        }
        return max;
    }
}
