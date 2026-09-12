package complexity;

/** The three Fibonacci methods developed in the chapter. */
public final class Fibonacci {

  private Fibonacci() {
    // This class should not be instantiated!
  }

  // Assumes n >= 0. Computes the nth Fibonacci number straight from the
  // recursive definition: O(2^n) time, O(n) space on the call stack.
  public static int fibRecursive(int n) {
    if (n <= 1) {
      return n;
    }
    return fibRecursive(n - 1) + fibRecursive(n - 2);
  }

  // Assumes n >= 0. Builds the sequence up from the bottom in an array, so
  // each value is computed once: O(n) time, O(n) auxiliary space.
  public static int fibWithArray(int n) {
    if (n <= 1) {
      return n;
    }
    int[] f = new int[n + 1];
    f[0] = 0;
    f[1] = 1;
    for (int i = 2; i <= n; i++) {
      f[i] = f[i - 1] + f[i - 2];
    }
    return f[n];
  }

  // Assumes n >= 0. Keeps only the last two values as a window that slides
  // up the sequence: O(n) time, O(1) auxiliary space.
  public static int fibWithTwoVariables(int n) {
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
