# Linear Array Algorithms Analysis Report

## DAA Assignment 2 - Pair 3 Implementation

### Algorithm Overview

This repository contains implementations of two fundamental linear array algorithms:

#### 1. Kadane's Algorithm (Student B)
Kadane's Algorithm finds the maximum sum of any contiguous subarray within a one-dimensional array of numbers. This implementation includes position tracking to identify the exact start and end indices of the maximum subarray.

#### 2. Boyer-Moore Majority Vote (Student A)
The Boyer-Moore Majority Vote Algorithm finds the majority element in an array (element that appears more than n/2 times) using a two-pass approach with constant space complexity.

### Complexity Analysis

#### Kadane's Algorithm
**Time Complexity:**
- Best/Average/Worst Case: Θ(n) - Single pass through the array

**Space Complexity:**
- Θ(1) - Uses only a constant amount of extra space

#### Boyer-Moore Majority Vote
**Time Complexity:**
- Best/Average/Worst Case: Θ(n) - Two passes through the array

**Space Complexity:**
- Θ(1) - Uses only a constant amount of extra space

### Implementation Features

- **Position tracking** for Kadane's algorithm (start/end indices)
- **Majority verification** for Boyer-Moore algorithm
- **Performance metrics collection** for both algorithms
- **Comprehensive unit tests** covering edge cases
- **CLI benchmark runner** for empirical analysis
- **Input validation** and error handling

### Usage

```bash
# Run benchmarks for both algorithms
java BenchmarkRunner

# Run all tests
mvn test

# Run specific algorithm tests
mvn test -Dtest=KadanesAlgorithmTest
mvn test -Dtest=BoyerMooreMajorityVoteTest
```

### Test Coverage

Both algorithms include comprehensive test suites covering:
- Edge cases (empty arrays, single elements, null inputs)
- Boundary conditions (exact majority, just below majority)
- Various input distributions (sorted, random, mixed)
- Correctness validation with known test cases

### Performance Results

Performance data will be collected and stored in CSV format in the `performance-plots/` directory, including:
- Time complexity validation plots
- Input size vs execution time analysis
- Comparison between different input distributions
