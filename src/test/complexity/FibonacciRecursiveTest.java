package complexity;

/** Runs the Fibonacci scenarios against the recursive version. */
public class FibonacciRecursiveTest extends FibonacciTest {

  @Override
  protected int fib(int n) {
    return Fibonacci.fibRecursive(n);
  }
}
