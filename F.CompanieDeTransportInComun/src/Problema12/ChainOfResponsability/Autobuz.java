package Problema12.ChainOfResponsability;

public class Autobuz extends AHandler{
    @Override
    void alegereMijlocDeTransport(Calator calator) {
        if(calator.getDistanta() >= 3 && calator.getDistanta() < 5){
            System.out.println("Calatorul " + calator.getNume() + " ar trebui sa mearga cu autobuzul");
        }
        else{
            if(getNextHandler() != null){
                getNextHandler().alegereMijlocDeTransport(calator);
            }
        }
    }
}
