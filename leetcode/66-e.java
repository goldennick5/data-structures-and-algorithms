package leetcode;

class Solution {
  public int[] plusOne(int[] digits) {
    int digitsLen = digits.length;

    //iterating from the right to left
    for (int i = digitsLen - 1; i >= 0; i--) {
      //if the el is less than 9 we increment and thats all fuck
      if (digits[i] < 9) {
        digits[i] += 1;
        return digits;
      }
      //here means it is 9 so automaticalli filling it with 0
      digits[i] = 0;
    }
    //creating new arr where all zeroes, except first el is 1
    int[] res = new int[digitsLen + 1];
    res[0] = 1;
    //that it bim bap pom pom hello google
    return res;
  }
}
