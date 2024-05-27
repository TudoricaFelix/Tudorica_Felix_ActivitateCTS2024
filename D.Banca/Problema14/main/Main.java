package Problema14.main;

import Problema14.Template.ARetrageriBancomat;
import Problema14.Template.RetragereBaniBancomat;

public class Main {
    public static void main(String[] args) {
        ARetrageriBancomat retragereBaniBancomat = new RetragereBaniBancomat();
        System.out.println("Retragerile de bani de la bancomat se fac dupa urmatorii pasi:");
        retragereBaniBancomat.proceduraRetragereBani();
    }
}
