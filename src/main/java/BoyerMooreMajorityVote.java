/**
 * Boyer-Moore Majority Vote Algorithm implementation for finding majority element.
 * Student A Assignment - DAA Assignment 2
 */
public class BoyerMooreMajorityVote {
    
    /**
     * Result class containing majority element and its count information
     */
    public static class MajorityResult {
        private final Integer majorityElement;
        private final int count;
        private final boolean isMajority;
        
        public MajorityResult(Integer majorityElement, int count, boolean isMajority) {
            this.majorityElement = majorityElement;
            this.count = count;
            this.isMajority = isMajority;
        }
        
        public Integer getMajorityElement() { return majorityElement; }
        public int getCount() { return count; }
        public boolean isMajority() { return isMajority; }
        
        @Override
        public String toString() {
            if (isMajority) {
                return String.format("Majority element: %d (appears %d times)", majorityElement, count);
            } else {
                return "No majority element found";
            }
        }
    }
    
    /**
     * Finds the majority element using Boyer-Moore Majority Vote Algorithm.
     * Time Complexity: O(n), Space Complexity: O(1)
     * 
     * @param arr the input array
     * @return MajorityResult containing the majority element and its count
     */
    public static MajorityResult findMajority(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new MajorityResult(null, 0, false);
        }
        
        // First pass: find candidate
        Integer candidate = null;
        int count = 0;
        
        for (int element : arr) {
            if (count == 0) {
                candidate = element;
                count = 1;
            } else if (element == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        // Second pass: verify if candidate is actually majority
        int majorityCount = 0;
        int majorityThreshold = arr.length / 2 + 1;
        
        for (int element : arr) {
            if (element == candidate) {
                majorityCount++;
            }
        }
        
        boolean isMajority = majorityCount >= majorityThreshold;
        
        return new MajorityResult(candidate, majorityCount, isMajority);
    }
    
    /**
     * Simple version returning just the majority element or null
     */
    public static Integer findMajorityElement(int[] arr) {
        MajorityResult result = findMajority(arr);
        return result.isMajority() ? result.getMajorityElement() : null;
    }
}
