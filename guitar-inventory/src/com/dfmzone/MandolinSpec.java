package com.dfmzone;

import java.util.Objects;

public class MandolinSpec extends InstrumentSpec {

    private Style style;

    public MandolinSpec(Type type, Builder builder, Wood backWood, Wood topWood, String model, Style style) {
        super(type, builder, backWood, topWood, model);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MandolinSpec that = (MandolinSpec) o;
        return style == that.style;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), style);
    }
}
