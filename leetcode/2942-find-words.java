package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    //dumbest solution that firstly comes in my mind
    public List<Integer> findWordsContainingFirst(String[] words, char x) {
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

    
    //better solution not using set and just breaking after add number and pursue to the next
    public List<Integer> findWordsContainingSecond(String[] words, char x) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < words[i].length(); j++) {
                if(words[i].charAt(j) == x) {
                    res.add(i);
                    break;
                }
            }
        }
        return res;
    }
}


