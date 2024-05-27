package Problema8.main;

import Problema8.Composite.ANod;
import Problema8.Composite.Meniu;
import Problema8.Composite.Produs;
import Problema8.Composite.Structura;

public class Main {
    public static void main(String[] args) {
        Structura structuraMeniu = new Structura("Meniu restaurant");

        Meniu meniu = new Meniu(structuraMeniu);

        ANod structuraStartere = new Structura("Startere");
        ANod structuraBauturi = new Structura("Bauturi");
        ANod structuraDeserturi = new Structura("Deserturi");
        structuraMeniu.adaugaNod(structuraStartere);
        structuraMeniu.adaugaNod(structuraBauturi);
        structuraMeniu.adaugaNod(structuraDeserturi);

        structuraStartere.adaugaNod(new Produs("Bruschete cu rosii"));
        structuraStartere.adaugaNod(new Produs("Mix masline picante"));
        structuraStartere.adaugaNod(new Produs("Tartar de ton"));

        structuraBauturi.adaugaNod(new Produs("Apa plata"));
        structuraBauturi.adaugaNod(new Produs("Fanta"));
        structuraBauturi.adaugaNod(new Produs("Apa minerala"));

        structuraDeserturi.adaugaNod(new Produs("Brownie"));
        structuraDeserturi.adaugaNod(new Produs("Papanasi"));
        structuraDeserturi.adaugaNod(new Produs("Clatite"));

        System.out.println(structuraMeniu.getInfo());
    }
}
