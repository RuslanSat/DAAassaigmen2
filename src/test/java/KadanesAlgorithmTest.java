import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KadanesAlgorithmTest {

    @Test
    void testAllPositiveNumbers() {
        int[] arr = {1, 2, 3, 4, 5};
        KadanesAlgorithm.MaxSubarrayResult result = KadanesAlgorithm.findMaxSubarray(arr);
        assertEquals(15, result.getMaxSum());
        assertEquals(0, result.getStartIndex());
        assertEquals(4, result.getEndIndex());
    }

    @Test
    void testMixedNumbers() {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        KadanesAlgorithm.MaxSubarrayResult result = KadanesAlgorithm.findMaxSubarray(arr);
        assertEquals(6, result.getMaxSum()); // subarray [4, -1, 2, 1]
        assertEquals(3, result.getStartIndex());
        assertEquals(6, result.getEndIndex());
    }

    @Test
    void testAllNegativeNumbers() {
        int[] arr = {-8, -3, -6, -2, -5, -4};
        KadanesAlgorithm.MaxSubarrayResult result = KadanesAlgorithm.findMaxSubarray(arr);
        assertEquals(-2, result.getMaxSum());
        assertEquals(3, result.getStartIndex());
        assertEquals(3, result.getEndIndex());
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        KadanesAlgorithm.MaxSubarrayResult result = KadanesAlgorithm.findMaxSubarray(arr);
        assertEquals(0, result.getMaxSum());
        assertEquals(-1, result.getStartIndex());
        assertEquals(-1, result.getEndIndex());
    }

    @Test
    void testSingleElement() {
        int[] arr = {5};
        KadanesAlgorithm.MaxSubarrayResult result = KadanesAlgorithm.findMaxSubarray(arr);
        assertEquals(5, result.getMaxSum());
        assertEquals(0, result.getStartIndex());
        assertEquals(0, result.getEndIndex());
    }

    @Test
    void testSimpleVersionMethod() {
        int[] arr = {3, -2, 5, -1};
        assertEquals(6, KadanesAlgorithm.maxSubarraySum(arr)); // [3, -2, 5]
    }
}
