public class Recursion {
  public static void main(String[] args) {
    Recursion recursion = new Recursion();
    long result = recursion.nFactorial(4);
    System.out.println(result);
  }

  public long nFactorial(int n) {
    if(n < 0) return -1;
    if(n == 0 || n == 1) return 1;
    return n * nFactorial(n - 1);
  }
  // nFactorial(4) = 24
  // -> 4 * nFactorial(3) => 24
  // --> 3 * nFactorial(2) => 6
  // ---> 2 * nFactorial(1) => 2
}