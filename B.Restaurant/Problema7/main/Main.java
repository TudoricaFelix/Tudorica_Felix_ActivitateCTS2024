package Problema7.main;

import Problema7.Decorator.DecoratorNotaDePlata;
import Problema7.Decorator.NotaDePlata;
import Problema7.Decorator.NotaDePlataSimpla;

public class Main {
    public static void main(String[] args) {
        NotaDePlata notaDePlata = new NotaDePlataSimpla(160);
        NotaDePlata notaDecorata = new DecoratorNotaDePlata(notaDePlata);

        notaDecorata.printeazaNota();
    }
}
