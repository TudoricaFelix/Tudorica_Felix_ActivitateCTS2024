package Problema8.Composite;

public class Produs extends ANod{

    String denumire;

    public Produs(String denumire){
        this.denumire = denumire;
    }

    @Override
    public String getDenumire() {
        return this.denumire;
    }
}

