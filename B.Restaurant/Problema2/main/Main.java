package Problema2.main;

import Problema2.Builder.Rezervare;
import Problema2.Builder.RezervareBuilder;

import static Problema2.Builder.ETipMuzica.USOARA;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder builder = new RezervareBuilder();
        Rezervare rezervare1 = builder.setAreGeam(true).setEsteDecorataMasa(true).setAreMuzicaPersonalizata(true).setTipMuzica(USOARA).build();
        System.out.println(rezervare1);
        RezervareBuilder builder2 = new RezervareBuilder();
        Rezervare rezervare2 = builder.setEsteDecorataMasa(true).setAreMuzicaPersonalizata(false).setAreScauneErgonomice(true).build();
        System.out.println(rezervare2);

    }
}
