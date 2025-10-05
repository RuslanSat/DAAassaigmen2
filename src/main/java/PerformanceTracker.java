public class PerformanceTracker {
    private int comparisons = 0;
    private int arrayAccesses = 0;
    private long startTime = 0;
    private long executionTimeNanos = 0;
    
    public void start() {
        startTime = System.nanoTime();
    }
    
    public void stop() {
        executionTimeNanos = System.nanoTime() - startTime;
    }
    
    public void incrementComparisons() {
        comparisons++;
    }
    
    public void incrementArrayAccesses() {
        arrayAccesses++;
    }
    
    public int getComparisons() { return comparisons; }
    public int getArrayAccesses() { return arrayAccesses; }
    public long getExecutionTimeNanos() { return executionTimeNanos; }
    
    public void reset() {
        comparisons = 0;
        arrayAccesses = 0;
        startTime = 0;
        executionTimeNanos = 0;
    }
}
