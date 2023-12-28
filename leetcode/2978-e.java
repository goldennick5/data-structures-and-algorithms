package leetcode;

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int counter = 0;
        for(int i = 0; i < hours.length; i++) {
            if(hours[i] >= target) {
                counter++;
            }
        }
        return counter;
    }
}


// Example 1:

// Input: hours = [0,1,2,3,4], target = 2
// Output: 3
// Explanation: The company wants each employee to work for at least 2 hours.
// - Employee 0 worked for 0 hours and didn't meet the target.
// - Employee 1 worked for 1 hours and didn't meet the target.
// - Employee 2 worked for 2 hours and met the target.
// - Employee 3 worked for 3 hours and met the target.
// - Employee 4 worked for 4 hours and met the target.
// There are 3 employees who met the target.