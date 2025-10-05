public class KadanesAlgorithm {

    public static class MaxSubarrayResult {
        private final int maxSum;
        private final int startIndex;
        private final int endIndex;
        
        public MaxSubarrayResult(int maxSum, int startIndex, int endIndex) {
            this.maxSum = maxSum;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }
        
        public int getMaxSum() { return maxSum; }
        public int getStartIndex() { return startIndex; }
        public int getEndIndex() { return endIndex; }
        
        @Override
        public String toString() {
            return String.format("Max sum: %d, range: [%d, %d]", maxSum, startIndex, endIndex);
        }
    }

    public static MaxSubarrayResult findMaxSubarray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new MaxSubarrayResult(0, -1, -1);
        }
        
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        int start = 0, end = 0, tempStart = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (maxEndingHere + arr[i] > arr[i]) {
                maxEndingHere = maxEndingHere + arr[i];
            } else {
                maxEndingHere = arr[i];
                tempStart = i;
            }
            
            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
                start = tempStart;
                end = i;
            }
        }
        
        return new MaxSubarrayResult(maxSoFar, start, end);
    }
    

    public static int maxSubarraySum(int[] arr) {
        return findMaxSubarray(arr).getMaxSum();
    }
}
