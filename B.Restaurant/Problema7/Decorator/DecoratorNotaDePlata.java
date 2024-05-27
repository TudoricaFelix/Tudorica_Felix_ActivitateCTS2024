package Problema7.Decorator;

public class DecoratorNotaDePlata extends ADecoratorNotaDePlata {

    public DecoratorNotaDePlata(NotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaNota() {
        super.printeazaNota();
        printeazaFelicitare();
    }

    private void printeazaFelicitare() {
        System.out.println("La mulți ani!");
    }
}
