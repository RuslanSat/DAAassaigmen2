# DAA Assignment 2 - Linear Array Algorithms

This project implements two fundamental linear array algorithms with comprehensive performance analysis and testing:

1. **Boyer-Moore Majority Vote Algorithm** - Single-pass majority element detection
2. **Kadane's Algorithm** - Maximum subarray sum with position tracking

## Project Structure

```
assignment2-linear-array-algorithms/
├── src/main/java/
│   ├── algorithms/
│   │   ├── BoyerMooreMajorityVote.java
│   │   └── KadanesAlgorithm.java
│   ├── metrics/
│   │   └── PerformanceTracker.java
│   └── cli/
│       └── BenchmarkRunner.java
├── src/test/java/
│   └── algorithms/
│       ├── BoyerMooreMajorityVoteTest.java
│       └── KadanesAlgorithmTest.java
├── docs/
│   └── performance-plots/
├── README.md
└── pom.xml
```

## Algorithms Overview

### Boyer-Moore Majority Vote Algorithm

**Purpose**: Find the majority element in an array (element that appears more than n/2 times)

**Time Complexity**: O(n) - single pass through the array  
**Space Complexity**: O(1) - only uses a few variables

**How it works**:
1. First pass: Find a candidate by maintaining a count
2. Second pass: Verify if the candidate is actually a majority element

**Key Features**:
- Single-pass candidate selection
- Verification step ensures correctness
- Handles edge cases (no majority, single element, etc.)

### Kadane's Algorithm

**Purpose**: Find the maximum sum of any contiguous subarray

**Time Complexity**: O(n) - single pass through the array  
**Space Complexity**: O(1) - only uses a few variables

**How it works**:
- Maintains maximum sum ending at current position
- Maintains overall maximum sum seen so far
- Tracks start and end positions of the maximum subarray

**Key Features**:
- Handles all-negative arrays
- Position tracking for the maximum subarray
- Optional empty subarray support

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven 3.6 or higher

### Building the Project

```bash
# Clone the repository
git clone <repository-url>
cd DAAassaigmen2

# Compile the project
mvn compile

# Run tests
mvn test

# Run the CLI benchmark tool
mvn exec:java
```

### Running the CLI Interface

```bash
mvn exec:java
```

The CLI provides the following options:
1. **Boyer-Moore Majority Vote Demo** - Interactive demonstration
2. **Kadane's Algorithm Demo** - Interactive demonstration  
3. **Performance Benchmark** - Automated performance testing
4. **Custom Test** - Test with your own arrays
5. **Scalability Test** - Test performance across different array sizes
6. **Export Benchmark Data** - Export results to CSV files

## Performance Analysis

### Boyer-Moore Majority Vote

- **Best Case**: O(n) - when majority element is found early
- **Worst Case**: O(n) - always requires two passes
- **Average Case**: O(n) - consistent performance
- **Space**: O(1) - constant space usage

### Kadane's Algorithm

- **Best Case**: O(n) - single pass through array
- **Worst Case**: O(n) - same as best case
- **Average Case**: O(n) - consistent linear performance
- **Space**: O(1) - constant space usage

## Testing

The project includes comprehensive unit tests covering:

- **Edge Cases**: Empty arrays, single elements, all same elements
- **Boundary Conditions**: Arrays with/without majority elements, all negative/positive
- **Performance Validation**: Metrics collection and verification
- **Error Handling**: Null arrays, invalid inputs

Run tests with:
```bash
mvn test
```

## Performance Metrics

The `PerformanceTracker` class collects detailed metrics:

- **Comparisons**: Number of element comparisons
- **Array Accesses**: Number of array element accesses
- **Memory Allocations**: Number of memory allocations
- **Execution Time**: Precise timing measurements
- **Recursive Calls**: Number of recursive function calls

## Benchmark Results

The CLI tool can export benchmark data to CSV files for analysis:

- `boyer_moore_benchmark.csv` - Boyer-Moore performance data
- `kadane_benchmark.csv` - Kadane's algorithm performance data

## Complexity Analysis

### Boyer-Moore Majority Vote

**Time Complexity**:
- Θ(n): Always requires exactly 2n comparisons and 2n array accesses
- O(n): Linear time complexity
- Ω(n): Must examine every element at least once

**Space Complexity**:
- Θ(1): Uses only a constant number of variables
- O(1): Constant space complexity

### Kadane's Algorithm

**Time Complexity**:
- Θ(n): Always requires exactly n comparisons and n array accesses
- O(n): Linear time complexity  
- Ω(n): Must examine every element

**Space Complexity**:
- Θ(1): Uses only a constant number of variables
- O(1): Constant space complexity

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/algorithm-optimization`)
3. Commit your changes (`git commit -am 'Add algorithm optimization'`)
4. Push to the branch (`git push origin feature/algorithm-optimization`)
5. Create a Pull Request

## License

This project is part of a DAA (Design and Analysis of Algorithms) assignment and is for educational purposes.

## Authors

- **Student A**: Boyer-Moore Majority Vote implementation
- **Student B**: Kadane's Algorithm implementation

## Assignment Requirements

This project fulfills the requirements for DAA Assignment 2:

- ✅ Clean, readable Java code with proper documentation
- ✅ Comprehensive unit tests covering edge cases
- ✅ Input validation and error handling
- ✅ Metrics collection (comparisons, array accesses, memory allocations)
- ✅ CLI interface for testing with different input sizes
- ✅ Performance optimizations and memory-efficient implementations
- ✅ Edge case handling
- ✅ Maven project structure with proper dependencies
- ✅ Git workflow with meaningful commit messages

## Team

**Assignment 2** - Ruslan Satvaldiev and Temirlan Zhienbay
