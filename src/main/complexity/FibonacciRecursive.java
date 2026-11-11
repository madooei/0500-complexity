package complexity;

/** The recursive Fibonacci method from the chapter. */
public final class FibonacciRecursive {

  private FibonacciRecursive() {
    // This class should not be instantiated!
  }

  // Assumes n >= 0.
  public static int fib(int n) {
    if (n <= 1) {
      return n;
    }
    return fib(n - 1) + fib(n - 2);
  }
}
