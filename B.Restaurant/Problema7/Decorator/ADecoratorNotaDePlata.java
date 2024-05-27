package Problema7.Decorator;

public abstract class ADecoratorNotaDePlata implements NotaDePlata {
    protected NotaDePlata notaDePlata;

    public ADecoratorNotaDePlata(NotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeazaNota() {
        notaDePlata.printeazaNota();
    }
}

