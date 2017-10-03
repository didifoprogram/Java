package com.dfmzone;

public enum InstrumentType {

    GUITAR, MANDOLIN, BANJO;

    @Override
    public String toString() {
        switch (this) {
            case BANJO:
                return "Banjo";
            case GUITAR:
                return "Guitar";
            case MANDOLIN:
                return "Mandolin";
        }
        return null;
    }
}
