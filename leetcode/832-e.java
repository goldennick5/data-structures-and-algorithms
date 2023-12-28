package leetcode;

//solution that firstly comes in my mind
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int start;
        int end;
        //firstly, i am flipping an array
        for (int i = 0; i < image.length; i++) {
            start = 0;
            end = image[i].length - 1;
            while (start <= end) {
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }
        }
        //secondly, I just invert it
        for(int i = 0; i < image.length; i++) {
            for(int j = 0; j < image[i].length; j++) {
                int num = image[i][j];
                if(num == 0) {
                    image[i][j] = 1;
                }
                if(num == 1) {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}
