/**
 * Quick test file to verify both algorithms are working
 * Compile and run this to check your implementations
 */
public class QuickTest {
    
    public static void main(String[] args) {
        System.out.println("=== QUICK ALGORITHM TEST ===");
        
        // Test Kadane's Algorithm
        System.out.println("\n1. KADANE'S ALGORITHM TEST:");
        testKadane();
        
        // Test Boyer-Moore
        System.out.println("\n2. BOYER-MOORE MAJORITY VOTE TEST:");
        testBoyerMoore();
        
        System.out.println("\n✅ All tests completed!");
    }
    
    private static void testKadane() {
        // Test the classic example
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        KadanesAlgorithm.MaxSubarrayResult result = KadanesAlgorithm.findMaxSubarray(arr);
        
        System.out.println("Array: [-2, 1, -3, 4, -1, 2, 1, -5, 4]");
        System.out.println("Result: " + result);
        
        // Check if result is correct
        if (result.getMaxSum() == 6 && result.getStartIndex() == 3 && result.getEndIndex() == 6) {
            System.out.println("✅ KADANE'S ALGORITHM WORKS CORRECTLY!");
        } else {
            System.out.println("❌ KADANE'S ALGORITHM HAS ISSUES!");
        }
    }
    
    private static void testBoyerMoore() {
        // Test with majority
        int[] arr1 = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        BoyerMooreMajorityVote.MajorityResult result1 = BoyerMooreMajorityVote.findMajority(arr1);
        
        System.out.println("Array: [3, 3, 4, 2, 4, 4, 2, 4, 4]");
        System.out.println("Result: " + result1);
        
        // Check if result is correct
        if (result1.isMajority() && result1.getMajorityElement() == 4 && result1.getCount() == 5) {
            System.out.println("✅ BOYER-MOORE ALGORITHM WORKS CORRECTLY!");
        } else {
            System.out.println("❌ BOYER-MOORE ALGORITHM HAS ISSUES!");
        }
        
        // Test without majority
        int[] arr2 = {1, 2, 3, 4, 5};
        BoyerMooreMajorityVote.MajorityResult result2 = BoyerMooreMajorityVote.findMajority(arr2);
        
        System.out.println("\nArray: [1, 2, 3, 4, 5]");
        System.out.println("Result: " + result2);
        
        if (!result2.isMajority()) {
            System.out.println("✅ NO MAJORITY DETECTION WORKS CORRECTLY!");
        } else {
            System.out.println("❌ NO MAJORITY DETECTION HAS ISSUES!");
        }
    }
}
