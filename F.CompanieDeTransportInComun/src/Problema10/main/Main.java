package Problema10.main;

import Problema10.SimpleFactory.ETipPlata;
import Problema10.SimpleFactory.IPlata;
import Problema10.SimpleFactory.PlataFactory;

public class Main {
    public static void main(String[] args) {
        PlataFactory plataFactory = new PlataFactory();
        IPlata plata = null;
        try {
            plata = plataFactory.crearePlata(ETipPlata.PlataSMS);
        } catch (Exception e) {
            e.printStackTrace();
        }

        plata.afisareInformatii();
    }
}
