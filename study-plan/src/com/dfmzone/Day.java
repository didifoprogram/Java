package com.dfmzone;

public enum Day {

    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA;

    public static void message(Day d) {
        switch (d) {
            case SEGUNDA:
                System.out.println("Dia chato");
                break;
            case TERCA:
                System.out.println("Dia medio");
                break;
            case QUARTA:
                System.out.println("Meio");
                break;
            default:
                System.out.println("Esse dia nao existe");
        }
    }
}

