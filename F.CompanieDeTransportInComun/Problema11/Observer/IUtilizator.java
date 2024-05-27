package Problema11.Observer;

public interface IUtilizator {
    void adaugareUtilizator(IObserver observer);
    void stergereUtilizator(IObserver observer);
    void notificareUtilizatori(String mesaj);
}
