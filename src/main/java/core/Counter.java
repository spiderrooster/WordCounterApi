package core;

import java.util.Arrays;
import java.util.List;

public class Counter {
    int tally = 0;

    public Counter add(Counter other) {
        this.tally += other.tally;
        return this;
    }
}
