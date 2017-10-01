package com.dfmzone;

import java.util.Objects;

public abstract class InstrumentSpec {

    private Type type;
    private Builder builder;
    private Wood backWood;
    private Wood topWood;
    private String model;

    public InstrumentSpec(Type type, Builder builder, Wood backWood, Wood topWood, String model) {
        this.type = type;
        this.builder = builder;
        this.backWood = backWood;
        this.topWood = topWood;
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstrumentSpec that = (InstrumentSpec) o;
        return type == that.type &&
                builder == that.builder &&
                backWood == that.backWood &&
                topWood == that.topWood &&
                Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, builder, backWood, topWood, model);
    }

    @Override
    public String toString() {
        return "InstrumentSpec{" +
                "type=" + type +
                ", builder=" + builder +
                ", backWood=" + backWood +
                ", topWood=" + topWood +
                ", model='" + model + '\'' +
                '}';
    }
}
