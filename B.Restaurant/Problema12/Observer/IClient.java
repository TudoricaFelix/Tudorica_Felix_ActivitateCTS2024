package Problema12.Observer;

public interface IClient {
    void adaugareClient(IObserver observer);
    void stergereClient(IObserver observer);
    void notificareClienti(String mesaj);
}
