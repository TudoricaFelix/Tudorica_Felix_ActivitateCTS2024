package Problema3.SimpleFactory;

public class SupaFactory {
    public ISupa creareSupa(ETipSupa tipSupa) throws Exception {
        switch (tipSupa) {
            case SupaDeCiuperci:
                return new SupaDeCiuperci();
            case SupaDeLegume:
                return new SupaDeLegume();
            case SupaDeVita:
                return new SupaDeVita();
            default:
                throw new Exception("Nu a fost aleasa nicio supa");
        }
    }
}
