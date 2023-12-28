package leetcode;

//solution that firstly comes in my mind
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int start;
        int end;
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
        for(int i = 0; i < image.length; i++) {
            for(int j = 0; j < image[i].length; j++) {
                image[i][j] = (image[i][j] == 0) ? 1 : 0;
            }
        }
        return image;
    }
}
