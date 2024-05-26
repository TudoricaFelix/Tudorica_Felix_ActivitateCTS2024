package Problema3.main;

import Problema3.SimpleFactory.ETipSupa;
import Problema3.SimpleFactory.ISupa;
import Problema3.SimpleFactory.SupaFactory;

public class Main {
    public static void main(String[] args) {
        SupaFactory supaFactory = new SupaFactory();
        ISupa supa = null;
        try {
            supa = supaFactory.creareSupa(ETipSupa.SupaDeVita);
        } catch (Exception e) {
            e.printStackTrace();
        }

        supa.afisareInformatii();
    }
}
