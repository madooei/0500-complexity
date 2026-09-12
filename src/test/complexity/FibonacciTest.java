package complexity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Tests for the Fibonacci methods. Each test is one scenario. The scenarios
 * are written once here; each version gets its own subclass that says which
 * method to call, so you can run the suite for one version at a time.
 */
public abstract class FibonacciTest {

  // Calls the version under test.
  protected abstract int fib(int n);

  @Test
  public void baseCaseZero() {
    assertEquals(0, fib(0));
  }

  @Test
  public void baseCaseOne() {
    assertEquals(1, fib(1));
  }

  @Test
  public void firstComputedValue() {
    // smallest n past the base cases: F(2) = F(1) + F(0)
    assertEquals(1, fib(2));
  }

  @Test
  public void smallN() {
    assertEquals(5, fib(5));
  }

  @Test
  public void fibOfTen() {
    assertEquals(55, fib(10));
  }

  @Test
  public void fibOfTwenty() {
    assertEquals(6765, fib(20));
  }

  @Test
  public void fibOfThirty() {
    // large enough that naive recursion is visibly slow
    assertEquals(832040, fib(30));
  }
}
