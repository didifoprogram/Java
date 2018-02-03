package com.dfmzone;

public class AbsoluteProgression extends AbstractProgression<Long> {

    private long prev;

    public AbsoluteProgression() {
        this(2, 200);

    }

    public AbsoluteProgression(long first, long second) {
        super(first);
        prev = Math.abs(second);
    }

    @Override
    protected void advance() {
        long tmp = prev;
        prev = Math.abs(current - prev);
        current = tmp;
    }
}
