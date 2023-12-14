public class TraversingArray {
  public static void main(String[] args) {
    int[] traversedArray = new int[]{1, 2, 3, 4, 5, 6, 7};
    TraversingArray traverse = new TraversingArray();
    traverse.traverseAnArray(traversedArray);
  }

  public void traverseAnArray(int arr[]) {
    int start = 0, end = arr.length - 1;
    while(start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
  