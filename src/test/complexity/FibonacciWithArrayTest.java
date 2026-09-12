package complexity;

/** Runs the Fibonacci scenarios against the version that uses an array. */
public class FibonacciWithArrayTest extends FibonacciTest {

  @Override
  protected int fib(int n) {
    return Fibonacci.fibWithArray(n);
  }
}
