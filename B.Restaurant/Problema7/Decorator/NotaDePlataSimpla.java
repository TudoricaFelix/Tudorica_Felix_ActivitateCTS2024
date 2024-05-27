package Problema7.Decorator;

public class NotaDePlataSimpla implements NotaDePlata {
    private int suma;

    public NotaDePlataSimpla(int suma) {
        this.suma = suma;
    }

    @Override
    public void printeazaNota() {
        System.out.println("Nota de plata: " + suma + " lei");
    }
}
