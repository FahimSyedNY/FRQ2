public class StepTracker {
    private int totsteps;
    private int days;
    private int min;
    private int active;

    public StepTracker(int min) {
        this.min = min;
    }

    public int activeDays() {
        return active;
    }

    public double averageSteps() {
        if (days > 0) return ((double) totsteps) / days;
        return 0.0;
    }

    public void addDailySteps(int steps) {
        totsteps += steps;
        days++;
        if (steps >= min) active++;
    }
}
