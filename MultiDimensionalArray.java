import java.util.Arrays;

public class MultiDimensionalArray {
  public static void main(String[] args) {
    int[][][] multiArr = {
      {
        {1, 2, 3},{4, 5, 6},{7, 8, 9}
      }, 
      {
        {1, 2, 3},{4, 5, 6},{7, 8, 9}
      }, 
      {
        {1, 2, 3},{4, 5, 6},{7, 8, 9}
      }
    };

    for(int i = 0; i < multiArr.length; ++i) {
      for(int j = 0; j < multiArr[i].length; ++j) {
        for(int k = 0; k < multiArr[i][j].length; ++k) {
          System.out.print(multiArr[i][j][k] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}