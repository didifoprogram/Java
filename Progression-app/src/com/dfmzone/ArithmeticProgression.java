package com.dfmzone;

public class ArithmeticProgression extends AbstractProgression<Long> {

    protected long increment;

    public ArithmeticProgression(long step, long start) {
        super(start);
        increment = step;
    }

    public ArithmeticProgression() {
        this(1, 0);
    }

    public ArithmeticProgression(long step) {
        this(step, 0);
    }

    @Override
    protected void advance() {
        current += increment;
    }
}
