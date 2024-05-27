package Problema11.Observer;

import java.util.ArrayList;
import java.util.List;

public class AplicatieAutobuz implements IUtilizator{
    private List<IObserver> listaObservatori;

    public AplicatieAutobuz() {
        super();
        this.listaObservatori = new ArrayList<>();
    }

    @Override
    public void adaugareUtilizator(IObserver observer) {
        this.listaObservatori.add(observer);

    }

    @Override
    public void stergereUtilizator(IObserver observer) {
        this.listaObservatori.remove(observer);
    }

    @Override
    public void notificareUtilizatori(String mesaj) {
        for(IObserver observer: listaObservatori)
            observer.getMesaj(mesaj);
    }
}
