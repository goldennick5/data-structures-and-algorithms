class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int lcounter = 0;
        int rcounter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L')
                lcounter++;
            else
                rcounter++;
            if (lcounter == rcounter)
                balance++;
        }
        return balance;
    }
}