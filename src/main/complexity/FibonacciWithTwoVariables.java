package complexity;

/** The bottom-up Fibonacci method from the chapter that keeps only the last two values. */
public final class FibonacciWithTwoVariables {

  private FibonacciWithTwoVariables() {
    // This class should not be instantiated!
  }

  // Assumes n >= 0.
  public static int fib(int n) {
    if (n <= 1) {
      return n;
    }
    int prev = 0;
    int curr = 1;
    for (int i = 2; i <= n; i++) {
      int next = prev + curr;
      prev = curr;
      curr = next;
    }
    return curr;
  }
}
