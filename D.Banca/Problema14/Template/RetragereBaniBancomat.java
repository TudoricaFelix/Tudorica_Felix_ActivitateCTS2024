package Problema14.Template;

public class RetragereBaniBancomat extends ARetrageriBancomat{
    @Override
    void introducereCard() {
        System.out.println("1. Se introduce cardul in bancomat");
    }

    @Override
    void introducerePin() {
        System.out.println("1. Se introduce pinul");
    }

    @Override
    void specificareSumaSolicitata() {
        System.out.println("3. Se specifica suma care doreste a fi extrasa");
    }

    @Override
    void retragereBani() {
        System.out.println("4. Se retrag banii din bancomat");
    }

    @Override
    void retragereCard() {
        System.out.println("5. Se retrage cardul din bancomat");
    }
}
