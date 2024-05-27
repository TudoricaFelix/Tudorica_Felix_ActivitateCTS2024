package Problema2.main;

import Problema2.Builder.Cont;
import Problema2.Builder.ContBuilder;

public class Main {
    public static void main(String[] args) {
        ContBuilder builder = new ContBuilder();
        Cont cont1 = builder.setAreCardAtasat(true).setAreSalariu(true).setAreInternetBanking(true).build();
        System.out.println(cont1);
        ContBuilder builder2 = new ContBuilder();
        Cont cont2 = builder2.setAreCardAtasat(true).build();
        System.out.println(cont2);
    }
}
