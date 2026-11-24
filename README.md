# Complexity Analysis

Three versions of the Fibonacci method `fib`, one class each: recursive, with an array, and with two variables. All three compute the same numbers; what differs is the time and space each one costs. A JUnit scenario suite checks them, and you can run it against one version at a time or all of them.

## Prerequisites

- JDK 17+ (JUnit 6 requires it).
- The JUnit jar is already vendored in `lib/`; there is nothing to download.

## Repository layout

```plaintext
code/
  README.md
  .gitignore
  lib/
    junit-platform-console-standalone-6.1.0.jar
  src/
    main/
      complexity/
        FibonacciRecursive.java             # recursive
        FibonacciWithArray.java             # bottom up, with an array
        FibonacciWithTwoVariables.java      # bottom up, with two variables
      demo/                                 # one demo per version
        FibonacciRecursiveDemo.java
        FibonacciWithArrayDemo.java
        FibonacciWithTwoVariablesDemo.java
    test/
      complexity/
        FibonacciTest.java                  # the scenarios, written once
        FibonacciRecursiveTest.java         # runs them against FibonacciRecursive
        FibonacciWithArrayTest.java         # runs them against FibonacciWithArray
        FibonacciWithTwoVariablesTest.java  # runs them against FibonacciWithTwoVariables
  scripts/
    test.sh                                 # compile everything and run the JUnit tests
    run.sh                                  # compile everything and run one demo
```

## How to compile and run

- `scripts/test.sh` — compiles everything and runs the full JUnit suite: every scenario is checked against all three versions of `fib`, so they must agree on every input.
- `scripts/test.sh complexity.FibonacciRecursiveTest` — compiles everything and runs the scenarios against one version only. Use this while you are working on one version and the others are still empty. The class names are listed in the layout above.
- `scripts/run.sh demo.FibonacciRecursiveDemo` — compiles everything and runs that one demo. Every version has its own demo, `<Class>Demo`.

The scenarios live in one abstract test class (`FibonacciTest`). The small classes that extend it do nothing but say which class to call, so the same scenarios run against every version without being copied.

## Contents

Each version is its own class, and every class has the same method, `fib`.

- `complexity.FibonacciRecursive` — `fib`, recursive: O(2^n) time and O(n) space.
- `complexity.FibonacciWithArray` — `fib`, bottom up with an array: O(n) time and O(n) auxiliary space.
- `complexity.FibonacciWithTwoVariables` — `fib`, bottom up with two variables: O(n) time and O(1) auxiliary space.
- `demo.FibonacciRecursiveDemo`, `demo.FibonacciWithArrayDemo`, and `demo.FibonacciWithTwoVariablesDemo` — one demo per version, each computing `fib(5)` as the notes do.
