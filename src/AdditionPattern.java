public class AdditionPattern {
    private int current;
    private int start;
    private int dif;
    public AdditionPattern(int current, int  dif) {
        this.current = current;
        this.dif = dif;
        start = current;
    }

    public int currentNumber() {
        return current;
    }

    public void next() {
        current += dif;
    }

    public void prev() {
        if (current > start) current -= dif;
    }
}
