package Problema12.Observer;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IClient{
    private List<IObserver> listaObservatori;

    public Restaurant() {
        super();
        this.listaObservatori = new ArrayList<>();
    }

    @Override
    public void adaugareClient(IObserver observer) {
        this.listaObservatori.add(observer);

    }

    @Override
    public void stergereClient(IObserver observer) {
        this.listaObservatori.remove(observer);
    }

    @Override
    public void notificareClienti(String mesaj) {
        for(IObserver observer: listaObservatori)
            observer.getMesaj(mesaj);
    }

}
