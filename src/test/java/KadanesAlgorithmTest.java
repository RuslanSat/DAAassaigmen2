import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KadanesAlgorithmTest {
    
    @Test
    public void testMaxSubarraySum() {
        assertEquals(6, KadanesAlgorithm.maxSubarraySum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(1, KadanesAlgorithm.maxSubarraySum(new int[]{1}));
        assertEquals(23, KadanesAlgorithm.maxSubarraySum(new int[]{5, 4, -1, 7, 8}));
        assertEquals(-1, KadanesAlgorithm.maxSubarraySum(new int[]{-1, -2, -3, -4}));
        assertEquals(0, KadanesAlgorithm.maxSubarraySum(new int[]{}));
        assertEquals(0, KadanesAlgorithm.maxSubarraySum(null));
    }
    
    @Test
    public void testFindMaxSubarrayWithPositions() {
        KadanesAlgorithm.MaxSubarrayResult result = KadanesAlgorithm.findMaxSubarray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        assertEquals(6, result.getMaxSum());
        assertEquals(3, result.getStartIndex());
        assertEquals(6, result.getEndIndex());
    }
    
    @Test
    public void testEmptyArray() {
        KadanesAlgorithm.MaxSubarrayResult result = KadanesAlgorithm.findMaxSubarray(new int[]{});
        assertEquals(0, result.getMaxSum());
        assertEquals(-1, result.getStartIndex());
        assertEquals(-1, result.getEndIndex());
    }
    
    @Test
    public void testNullArray() {
        KadanesAlgorithm.MaxSubarrayResult result = KadanesAlgorithm.findMaxSubarray(null);
        assertEquals(0, result.getMaxSum());
        assertEquals(-1, result.getStartIndex());
        assertEquals(-1, result.getEndIndex());
    }
}
