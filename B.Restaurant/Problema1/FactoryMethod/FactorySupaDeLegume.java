package Problema1.FactoryMethod;

public class FactorySupaDeLegume implements IFactory{
    @Override
    public ISupa creareSupa() {
        return new SupaDeLegume();
    }
}
