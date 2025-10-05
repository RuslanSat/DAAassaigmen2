/**
 * CLI benchmark runner for Linear Array Algorithms performance testing
 * Includes both Kadane's Algorithm and Boyer-Moore Majority Vote
 */
public class BenchmarkRunner {
    
    public static void main(String[] args) {
        System.out.println("Linear Array Algorithms Benchmark Runner");
        System.out.println("========================================");
        
        int[] testSizes = {100, 1000, 10000, 100000};
        
        for (int size : testSizes) {
            System.out.printf("\nTesting with array size: %d%n", size);
            System.out.println("----------------------------------------");
            
            // Generate test arrays
            int[] randomArray = generateRandomArray(size);
            int[] sortedArray = generateSortedArray(size);
            int[] reverseSortedArray = generateReverseSortedArray(size);
            int[] majorityArray = generateMajorityArray(size);
            
            // Test Kadane's Algorithm
            System.out.println("KADANE'S ALGORITHM (Maximum Subarray Sum):");
            testKadaneArray("Random Array", randomArray);
            testKadaneArray("Sorted Array", sortedArray);
            testKadaneArray("Reverse Sorted Array", reverseSortedArray);
            
            System.out.println("\nBOYER-MOORE MAJORITY VOTE:");
            testMajorityArray("Random Array", randomArray);
            testMajorityArray("Majority Array", majorityArray);
            testMajorityArray("No Majority Array", generateNoMajorityArray(size));
        }
    }
    
    private static void testKadaneArray(String arrayType, int[] array) {
        PerformanceTracker tracker = new PerformanceTracker();
        
        tracker.start();
        KadanesAlgorithm.MaxSubarrayResult result = KadanesAlgorithm.findMaxSubarray(array);
        tracker.stop();
        
        System.out.printf("  %s: Max sum = %d, Range = [%d, %d], Time = %d ns%n",
            arrayType, result.getMaxSum(), result.getStartIndex(), 
            result.getEndIndex(), tracker.getExecutionTimeNanos());
    }
    
    private static void testMajorityArray(String arrayType, int[] array) {
        PerformanceTracker tracker = new PerformanceTracker();
        
        tracker.start();
        BoyerMooreMajorityVote.MajorityResult result = BoyerMooreMajorityVote.findMajority(array);
        tracker.stop();
        
        if (result.isMajority()) {
            System.out.printf("  %s: Majority = %d (count: %d), Time = %d ns%n",
                arrayType, result.getMajorityElement(), result.getCount(), tracker.getExecutionTimeNanos());
        } else {
            System.out.printf("  %s: No majority found (candidate: %s), Time = %d ns%n",
                arrayType, result.getMajorityElement(), tracker.getExecutionTimeNanos());
        }
    }
    
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        java.util.Random random = new java.util.Random(42); // Fixed seed for reproducibility
        
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(201) - 100; // Range: -100 to 100
        }
        
        return array;
    }
    
    private static int[] generateSortedArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }
    
    private static int[] generateReverseSortedArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = size - i;
        }
        return array;
    }
    
    private static int[] generateMajorityArray(int size) {
        int[] array = new int[size];
        int majorityElement = 42;
        int majorityCount = size / 2 + 1; // Ensure majority
        
        // Fill majority elements
        for (int i = 0; i < majorityCount; i++) {
            array[i] = majorityElement;
        }
        
        // Fill remaining with different elements
        java.util.Random random = new java.util.Random(42);
        for (int i = majorityCount; i < size; i++) {
            array[i] = random.nextInt(100) + 100; // Different range
        }
        
        // Shuffle array
        for (int i = 0; i < size; i++) {
            int j = random.nextInt(size);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        
        return array;
    }
    
    private static int[] generateNoMajorityArray(int size) {
        int[] array = new int[size];
        
        // Create array where no element appears more than n/2 times
        for (int i = 0; i < size; i++) {
            array[i] = i % (size / 2 + 1);
        }
        
        // Shuffle array
        java.util.Random random = new java.util.Random(42);
        for (int i = 0; i < size; i++) {
            int j = random.nextInt(size);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        
        return array;
    }
}
