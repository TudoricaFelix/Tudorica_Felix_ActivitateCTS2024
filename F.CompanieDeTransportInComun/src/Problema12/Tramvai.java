package Problema12;

public class Tramvai extends AHandler{
    @Override
    void alegereMijlocDeTransport(Calator calator) {
        if(calator.getDistanta() >= 5 && calator.getDistanta() < 10){
            System.out.println("Calatorul " + calator.getNume() + " ar trebui sa mearga cu tramvaiul");
        }
        else{
            if(getNextHandler() != null){
                getNextHandler().alegereMijlocDeTransport(calator);
            }
        }
    }
}
