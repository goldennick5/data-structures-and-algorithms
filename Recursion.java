public class Recursion {
  public static void main(String[] args) {
    Recursion recursion = new Recursion();
    long nFactorial = recursion.nFactorial(4);
    System.out.println(nFactorial);
    int Fibonacci = recursion.Fibonacci(4);
    System.out.println(Fibonacci);
    recursion.printFibonacciSequence(9);
    System.out.println();
    int SumPositiveDigits = recursion.SumDigitsOfPositiveInteger(123);
    System.out.println("The sum of position integers is " + SumPositiveDigits);
    int PowerOfNumber = recursion.PowerOfNumber(5, 4);
    System.out.println(PowerOfNumber);
    int gcd = recursion.gcd(12, 8);
    System.out.println(gcd);
    int decimalToBinary = recursion.convertDecToBin(18);
    System.out.println(decimalToBinary);
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
  }

  // 3.0 Find the sum of the digits in a positive integer 
  public int SumDigitsOfPositiveInteger(int n) {
    if(n == 0 || n < 0) return 0;
    return n % 10 + (SumDigitsOfPositiveInteger(n / 10));
  }

  // SumPositiveDigits(123)
  // 123 % 10 + (SumPositiveDigits(123 / 10)) 3 + 3 = 6
  // 12 % 10 + (SumPositiveDigits(12 / 10)) 1 + 2 = 3
  // 1 % 10 + (SumPositiveDigits(1 / 10)) 1 + 1 = 2

  //4.0 Find the power of a number
  public int PowerOfNumber(int num, int power) {
    if(power == 0) return 1;
    if(power < 0) return -1;
    return num * PowerOfNumber(num, power - 1);
  }

  //5.0 Finding GCD using Eucleadian algorithm
  public int gcd(int num_one, int num_two) {
    if(num_two != 0) return gcd(num_two, num_one % num_two);
    if(num_two == 0) return num_one;
    else return -1;
  }

  //6.0 Converting decimal to binary
  public int convertDecToBin(int number) {
    if(number < 0) return -1;
    if(number == 0) return 0;
    return number % 2 + 10 * convertDecToBin(number / 2);
  }
}