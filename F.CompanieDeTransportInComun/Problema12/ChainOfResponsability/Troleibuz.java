package Problema12.ChainOfResponsability;

public class Troleibuz extends AHandler{

    @Override
    public void alegereMijlocDeTransport(Calator calator) {
        if(calator.getDistanta() < 3){
            System.out.println("Calatorul " + calator.getNume() + " ar trebui sa mearga cu troleibuzul");
        }
        else{
            if(getNextHandler() != null){
                getNextHandler().alegereMijlocDeTransport(calator);
            }
        }
    }
}
