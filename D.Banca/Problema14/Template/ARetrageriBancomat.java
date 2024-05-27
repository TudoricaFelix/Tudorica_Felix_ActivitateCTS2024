package Problema14.Template;

public abstract class ARetrageriBancomat {
    abstract void introducereCard();
    abstract void introducerePin();
    abstract void specificareSumaSolicitata();
    abstract void retragereBani();
    abstract void retragereCard();

    public final void proceduraRetragereBani(){
        introducereCard();
        introducerePin();
        specificareSumaSolicitata();
        retragereBani();
        retragereCard();
    }
}
