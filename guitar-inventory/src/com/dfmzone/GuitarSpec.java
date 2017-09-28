package com.dfmzone;

import java.util.Objects;

public class GuitarSpec {

    private Type type;
    private Builder builder;
    private Wood backWood;
    private Wood topWood;
    private String model;
    private int numOfStrings;

    public GuitarSpec(Type type, Builder builder, Wood backWood, Wood topWood, String model, int numOfStrings) {
        this.type = type;
        this.builder = builder;
        this.backWood = backWood;
        this.topWood = topWood;
        this.model = model;
        this.numOfStrings = numOfStrings;
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

    public int getNumOfStrings() {
        return numOfStrings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuitarSpec that = (GuitarSpec) o;
        return numOfStrings == that.numOfStrings &&
                type == that.type &&
                builder == that.builder &&
                backWood == that.backWood &&
                topWood == that.topWood &&
                model.equals(that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, builder, backWood, topWood, model, numOfStrings);
    }

    @Override
    public String toString() {
        return "GuitarSpec{" +
                "type=" + type +
                ", builder=" + builder +
                ", backWood=" + backWood +
                ", topWood=" + topWood +
                ", model='" + model + '\'' +
                ", numOfStrings=" + numOfStrings +
                '}';
    }
}
