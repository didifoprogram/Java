package com.dfmzone;

import java.util.Objects;

public class GuitarSpec extends InstrumentSpec {

    private int numOfStrings;

    public GuitarSpec(Type type, Builder builder, Wood backWood, Wood topWood, String model, int numOfStrings) {
        super(type, builder, backWood, topWood, model);
        this.numOfStrings = numOfStrings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuitarSpec that = (GuitarSpec) o;
        return numOfStrings == that.numOfStrings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numOfStrings);
    }
}
