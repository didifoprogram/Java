package com.dfmzone;

import java.math.BigInteger;

public class FibonacciProgression extends AbstractProgression<BigInteger> {

    protected BigInteger prev;

    public FibonacciProgression(BigInteger first, BigInteger second) {
        super(first);
        prev = second.subtract(first);
    }

    public FibonacciProgression() {
        this(BigInteger.ZERO,BigInteger.ONE);
    }

    @Override
    protected void advance() {
//        long temp = prev;
        current = current.add(prev);
        prev = current.subtract(prev);
    }
}
