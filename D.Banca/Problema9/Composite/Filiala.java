package Problema9.Composite;

public class Filiala extends ANod{

    String denumire;

    public Filiala(String denumire){
        this.denumire = denumire;
    }
    @Override
    public String getDenumire() {
        return this.denumire;
    }

}
