package Problema1.main;

import Problema1.FactoryMethod.FactorySupaDeCiuperci;
import Problema1.FactoryMethod.IFactory;
import Problema1.FactoryMethod.ISupa;

public class Main {
    public static void main(String[] args) {
        IFactory factory = null;
        factory = new FactorySupaDeCiuperci();

        ISupa supa= null;
        supa = factory.creareSupa();
        supa.afisareInformatii();
    }
}
