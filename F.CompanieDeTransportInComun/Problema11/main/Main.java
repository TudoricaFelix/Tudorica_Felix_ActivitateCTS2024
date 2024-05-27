package Problema11.main;

import Problema11.Observer.NotififcareAutobuz;
import Problema11.Observer.Utilizator;

public class Main {
    public static void main(String[] args) {
        Utilizator utilizator1 = new Utilizator("Cosmin");
        Utilizator utilizator2 = new Utilizator("Vlad");
        Utilizator utilizator3 = new Utilizator("Iulia");
        Utilizator utilizator4 = new Utilizator("Cristian");
        Utilizator utilizator5 = new Utilizator("Denisa");

        NotififcareAutobuz notificareCapatDeLinie = new NotififcareAutobuz();

        notificareCapatDeLinie.adaugareUtilizator(utilizator1);
        notificareCapatDeLinie.adaugareUtilizator(utilizator2);
        notificareCapatDeLinie.adaugareUtilizator(utilizator3);
        notificareCapatDeLinie.adaugareUtilizator(utilizator4);
        notificareCapatDeLinie.adaugareUtilizator(utilizator5);

        notificareCapatDeLinie.capatDeLinie();
    }
}
