package demo;

import complexity.FibonacciWithTwoVariables;

/** A demo of FibonacciWithTwoVariables on fib(5), the example the notes use. */
public final class FibonacciWithTwoVariablesDemo {

  private FibonacciWithTwoVariablesDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int index = 5;
    System.out.println("index: " + index);

    // The sequence starts 0, 1, 1, 2, 3, 5. Expect 5.
    int value = FibonacciWithTwoVariables.fib(index);
    System.out.println("fib(" + index + "): " + value);
  }
}
