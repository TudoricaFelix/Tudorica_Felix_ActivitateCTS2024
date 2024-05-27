package Problema10.SimpleFactory;

public class PlataFactory {
    public IPlata crearePlata(ETipPlata tipPlata) throws Exception {
        switch (tipPlata) {
            case CardCalatorii:
                return new CardCalatorii();
            case CardBancar:
                return new CardBancar();
            case PlataSMS:
                return new PlataSMS();
            default:
                throw new Exception("Nu s-a putut identifica modalitatea de plata.");
        }
    }
}
