package complexity;

/** The three Fibonacci methods developed in the chapter. */
public final class Fibonacci {

  private Fibonacci() {
    // This class should not be instantiated!
  }

  // Assumes n >= 0. Computes the nth Fibonacci number straight from the
  // recursive definition: O(2^n) time, O(n) space on the call stack.
  public static int fibRecursive(int n) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Assumes n >= 0. Builds the sequence up from the bottom in an array, so
  // each value is computed once: O(n) time, O(n) auxiliary space.
  public static int fibWithArray(int n) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Assumes n >= 0. Keeps only the last two values as a window that slides
  // up the sequence: O(n) time, O(1) auxiliary space.
  public static int fibWithTwoVariables(int n) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }
}
