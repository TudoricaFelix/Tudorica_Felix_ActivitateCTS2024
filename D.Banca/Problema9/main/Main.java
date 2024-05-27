package Problema9.main;

import Problema9.Composite.ANod;
import Problema9.Composite.Banca;
import Problema9.Composite.Filiala;
import Problema9.Composite.Structura;

public class Main {
    public static void main(String[] args) {
        Structura structuraBanca = new Structura("Sucursala 1");

        Banca banca = new Banca(structuraBanca);

        ANod structuraAgentie1 = new Structura("Agentia 1");
        ANod structuraAgentie2 = new Structura("Agentia 2");
        ANod structuraAgentie3 = new Structura("Agentia 3");
        structuraBanca.adaugaNod(structuraAgentie1);
        structuraBanca.adaugaNod(structuraAgentie2);
        structuraBanca.adaugaNod(structuraAgentie3);

        structuraAgentie1.adaugaNod(new Filiala("Filiala 1"));
        structuraAgentie1.adaugaNod(new Filiala("Filiala 2"));
        structuraAgentie2.adaugaNod(new Filiala("Filiala 3"));
        structuraAgentie2.adaugaNod(new Filiala("Filiala 4"));
        structuraAgentie3.adaugaNod(new Filiala("Filiala 5"));

        System.out.println(structuraBanca.getInfo());
    }
}
