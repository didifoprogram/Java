package com.dfmzone;

public enum Builder {

    FENDER, GIBSON, MARTIN, COLLINGS,
    OLSON, RYAN, PRS, ANY;

    @Override
    public String toString() {
        switch (this) {
            case PRS:
                return "prs";
            case RYAN:
                return "ryan";
            case OLSON:
                return "olson";
            case FENDER:
                return "fender";
            case GIBSON:
                return "gibson";
            case MARTIN:
                return "martin";
            case COLLINGS:
                return "collings";
                default:
                    return ANY.toString();
        }
    }
}
