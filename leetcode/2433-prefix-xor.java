package leetcode;

class Solution {
    public int[] findArray(int[] pref) {
        int[] xorRes = new int[pref.length];
        xorRes[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            xorRes[i] = pref[i] ^ pref[i - 1];
        }
        return xorRes;
    }
}


// Example 1:

// Input: pref = [5,2,0,3,1]
// Output: [5,7,2,3,2]
// Explanation: From the array [5,7,2,3,2] we have the following:
// - pref[0] = 5.
// - pref[1] = 5 ^ 7 = 2.
// - pref[2] = 5 ^ 7 ^ 2 = 0.
// - pref[3] = 5 ^ 7 ^ 2 ^ 3 = 3.
// - pref[4] = 5 ^ 7 ^ 2 ^ 3 ^ 2 = 1.