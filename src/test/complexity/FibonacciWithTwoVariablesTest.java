package complexity;

/** Runs the Fibonacci scenarios against the version that uses two variables. */
public class FibonacciWithTwoVariablesTest extends FibonacciTest {

  @Override
  protected int fib(int n) {
    return FibonacciWithTwoVariables.fib(n);
  }
}
