package Problema12.ChainOfResponsability;

public class Metrou extends AHandler{
    @Override
    void alegereMijlocDeTransport(Calator calator) {
        System.out.println("Calatorul " + calator.getNume() + " ar trebui sa mearga cu metroul");
    }
}
