package com.dfmzone;

public enum Wood {

    ALDER, MAPLE, INDIAN_ROSEWOOD, SITKA;

    @Override
    public String toString() {
        switch (this) {
            case ALDER:
                return "alder";
            case MAPLE:
                return "maple";
            case SITKA:
                return "sitka";
            case INDIAN_ROSEWOOD:
                return "indian_rosewood";
                default:
                    return "wood";
        }
    }
}
