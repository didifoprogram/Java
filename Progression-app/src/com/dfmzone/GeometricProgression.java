package com.dfmzone;

public class GeometricProgression extends AbstractProgression<Long> {

    protected long base;

    public GeometricProgression(long b, long start) {
        super(start);
        base = b;
    }

    public GeometricProgression() {
        this(2, 1);
    }

    public GeometricProgression(long b) {
        this(b, 1);
    }

    @Override
    protected void advance() {
        current *= base;
    }

}
