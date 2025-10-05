import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoyerMooreMajorityVoteTest {
    
    @Test
    public void testFindMajority_WithMajority() {
        int[] array = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        BoyerMooreMajorityVote.MajorityResult result = BoyerMooreMajorityVote.findMajority(array);
        
        assertTrue(result.isMajority());
        assertEquals(4, result.getMajorityElement());
        assertEquals(5, result.getCount());
    }
    
    @Test
    public void testFindMajority_NoMajority() {
        int[] array = {3, 3, 4, 2, 4, 4, 2, 4};
        BoyerMooreMajorityVote.MajorityResult result = BoyerMooreMajorityVote.findMajority(array);
        
        assertFalse(result.isMajority());
        assertEquals(4, result.getCount());
    }
    
    @Test
    public void testFindMajority_SingleElement() {
        int[] array = {42};
        BoyerMooreMajorityVote.MajorityResult result = BoyerMooreMajorityVote.findMajority(array);
        
        assertTrue(result.isMajority());
        assertEquals(42, result.getMajorityElement());
        assertEquals(1, result.getCount());
    }
    
    @Test
    public void testFindMajority_AllSameElements() {
        int[] array = {5, 5, 5, 5, 5};
        BoyerMooreMajorityVote.MajorityResult result = BoyerMooreMajorityVote.findMajority(array);
        
        assertTrue(result.isMajority());
        assertEquals(5, result.getMajorityElement());
        assertEquals(5, result.getCount());
    }
    
    @Test
    public void testFindMajority_TwoElements() {
        int[] array = {1, 2};
        BoyerMooreMajorityVote.MajorityResult result = BoyerMooreMajorityVote.findMajority(array);
        
        assertFalse(result.isMajority());
        assertEquals(1, result.getCount());
    }
    
    @Test
    public void testFindMajority_EmptyArray() {
        BoyerMooreMajorityVote.MajorityResult result = BoyerMooreMajorityVote.findMajority(new int[]{});
        
        assertFalse(result.isMajority());
        assertNull(result.getMajorityElement());
        assertEquals(0, result.getCount());
    }
    
    @Test
    public void testFindMajority_NullArray() {
        BoyerMooreMajorityVote.MajorityResult result = BoyerMooreMajorityVote.findMajority(null);
        
        assertFalse(result.isMajority());
        assertNull(result.getMajorityElement());
        assertEquals(0, result.getCount());
    }
    
    @Test
    public void testFindMajorityElement_WithMajority() {
        int[] array = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        Integer majority = BoyerMooreMajorityVote.findMajorityElement(array);
        
        assertNotNull(majority);
        assertEquals(4, majority.intValue());
    }
    
    @Test
    public void testFindMajorityElement_NoMajority() {
        int[] array = {3, 3, 4, 2, 4, 4, 2, 4};
        Integer majority = BoyerMooreMajorityVote.findMajorityElement(array);
        
        assertNull(majority);
    }
    
    @Test
    public void testFindMajority_ExactMajority() {
        int[] array = {1, 2, 1, 2, 1}; // 3 out of 5 elements
        BoyerMooreMajorityVote.MajorityResult result = BoyerMooreMajorityVote.findMajority(array);
        
        assertTrue(result.isMajority());
        assertEquals(1, result.getMajorityElement());
        assertEquals(3, result.getCount());
    }
    
    @Test
    public void testFindMajority_JustBelowMajority() {
        int[] array = {1, 2, 1, 2, 3}; // 2 out of 5 elements (not majority)
        BoyerMooreMajorityVote.MajorityResult result = BoyerMooreMajorityVote.findMajority(array);
        
        assertFalse(result.isMajority());
        assertEquals(2, result.getCount());
    }
}
