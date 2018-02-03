package com.dfmzone;

import java.text.DecimalFormat;

public class SquareRootProgression extends AbstractProgression<Double> {

//    private String pattern = "###.#####";
//    private DecimalFormat decimalFormat = new DecimalFormat(pattern);

    public SquareRootProgression() {
        this(65.536);
    }

    public SquareRootProgression(Double start) {
        super(start);
    }

    @Override
    protected void advance() {
        current = Math.sqrt(current);
    }
}
