package complexity;

/** The three Fibonacci methods developed in the chapter. */
public final class Fibonacci {

  private Fibonacci() {
    // This class should not be instantiated!
  }

  // Assumes n >= 0.
  public static int fibRecursive(int n) {
    if (n <= 1) {
      return n;
    }
    return fibRecursive(n - 1) + fibRecursive(n - 2);
  }

  // Assumes n >= 0.
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

  // Assumes n >= 0.
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
