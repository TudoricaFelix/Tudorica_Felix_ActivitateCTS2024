package Problema11.Observer;

public class Utilizator implements IObserver {
    private String nume;

    public Utilizator(String nume) {
        super();
        this.nume = nume;
    }

    @Override
    public void getMesaj(String mesaj) {
        System.out.println("Clientul " + this.nume + " a primit mesajul: " + mesaj);
    }
}
