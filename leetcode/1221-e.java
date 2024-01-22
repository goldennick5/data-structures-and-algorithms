package leetcode;

class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int lbalance = 0;
        int rbalance = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'L') lbalance++;
            else rbalance++;
            if(lbalance == rbalance) balance++;
        }
        return balance;
    }
}