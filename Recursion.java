public class Recursion {
  public static void main(String[] args) {
    Recursion recursion = new Recursion();
    long nFactorial = recursion.nFactorial(4);
    System.out.println(nFactorial);
    int Fibonacci = recursion.Fibonacci(4);
    System.out.println(Fibonacci);
    recursion.printFibonacciSequence(9);
  }

  // 1.0 Factorial Problem
  public long nFactorial(int n) {
    if(n < 0) return -1;
    if(n == 0 || n == 1) return 1;
    return n * nFactorial(n - 1);
  }
  // nFactorial(4) = 24
  // -> 4 * nFactorial(3) => 24
  // --> 3 * nFactorial(2) => 6
  // ---> 2 * nFactorial(1) => 2

  // 2.0 Fibonacci Problem
  public void printFibonacciSequence(int n) {
    if(n < 0) {
      System.out.println("invalid input");
      return;
    };
    for(int i = 0; i <= n; i++) {
      System.out.print(Fibonacci(i) + " ");
    }
  }

  public int Fibonacci(int n) {
    if(n < 0) return -1;
    if(n == 0 || n == 1) return n;
    return Fibonacci(n - 1) + Fibonacci(n - 2);

    //                                       Fibonacci(4) = 3
    //                 2  Fibonacci(3)         <----->       Fibonacci(2)  1
    //      1 + 1  Fibonacci(2) + Fibonacci(1) <-----> Fibonacci(1) + Fibonacci(0)  1
    //   1  Fibonacci(1) + Fibonacci(0)

    //test
  }
}