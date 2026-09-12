# Complexity Analysis

Three versions of the Fibonacci method: recursive, with an array, and with two
variables. All three compute the same numbers; what differs is the time and
space each one costs. A JUnit scenario suite checks them, and you can run it
against one version at a time or all of them.

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
        Fibonacci.java                      # recursive, with an array, and with two variables
    test/
      complexity/
        FibonacciTest.java                  # the scenarios, written once
        FibonacciRecursiveTest.java         # runs them against the recursive version
        FibonacciWithArrayTest.java         # runs them against the version with an array
        FibonacciWithTwoVariablesTest.java  # runs them against the version with two variables
  scripts/
    test.sh                                 # compile everything and run the JUnit tests
```

## How to compile and run

- `scripts/test.sh` — compiles everything and runs the full JUnit suite: every
  scenario is checked against all three versions of `fib`, so they must agree
  on every input.
- `scripts/test.sh complexity.FibonacciRecursiveTest` — compiles everything
  and runs the scenarios against one version only. Use this while you are
  working on one version and the others are still empty. The class names are
  listed in the layout above.

The scenarios live in one abstract test class (`FibonacciTest`). The small
classes that extend it do nothing but say which method to call, so the same
scenarios run against every version without being copied.

## What's here

- `complexity.Fibonacci` — the three Fibonacci methods: `fibRecursive`, O(2^n)
  time and O(n) space; `fibWithArray`, O(n) time and O(n) auxiliary space; and
  `fibWithTwoVariables`, O(n) time and O(1) auxiliary space.
