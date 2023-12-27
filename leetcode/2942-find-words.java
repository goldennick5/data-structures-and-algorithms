package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//dumbest solution that comes in my mind
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        //to store unique values
        HashSet<Integer> res = new HashSet<Integer>();
        ArrayList<Integer> finalRes = new ArrayList<Integer>();
        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < words[i].length(); j++) {
                //if char equal to target char, i am adding to set
                if(words[i].charAt(j) == x) {
                    res.add(i);
                }
            }
        }
        //copying values from set to list, because func is returning list
        finalRes.addAll(res);
        return finalRes;
    }
}
