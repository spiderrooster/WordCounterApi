package core;

public class Counter {
    int length = 0;
    int tally = 0;

    public Counter(int length, int tally) {
        this.length = length;
        this.tally = tally;
    }

    public Counter add(Counter other) {
        if (other.length == this.length) {
            this.tally += other.tally;
        }
        return this;
    }
}
