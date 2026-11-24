package demo;

import complexity.FibonacciWithArray;

/** A demo of FibonacciWithArray on fib(5), the example the notes use. */
public final class FibonacciWithArrayDemo {

  private FibonacciWithArrayDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int index = 5;
    System.out.println("index: " + index);

    // The sequence starts 0, 1, 1, 2, 3, 5. Expect 5.
    int value = FibonacciWithArray.fib(index);
    System.out.println("fib(" + index + "): " + value);
  }
}
