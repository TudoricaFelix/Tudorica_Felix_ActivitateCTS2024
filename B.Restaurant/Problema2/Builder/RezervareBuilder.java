package Problema2.Builder;

public class RezervareBuilder implements IBuilder{
    private Rezervare rezervare;

    public RezervareBuilder() {
        rezervare = new Rezervare(false,false,false,false, null);
    }
    @Override
    public Rezervare build() {
        return rezervare;
    }

    public RezervareBuilder setAreGeam(boolean areGeam) {
        this.rezervare.setAreGeam(areGeam);
        return this;
    }

    public RezervareBuilder setAreScauneErgonomice(boolean areScauneErgonomice) {
        this.rezervare.setAreScauneErgonomice(areScauneErgonomice);
        return this;
    }

    public RezervareBuilder setEsteDecorataMasa(boolean esteDecorataMasa) {
        this.rezervare.setEsteDecorataMasa(esteDecorataMasa);
        return this;
    }

    public RezervareBuilder setAreMuzicaPersonalizata(boolean areMuzicaPersonalizata) {
        this.rezervare.setAreMuzicaPersonalizata(areMuzicaPersonalizata);
        return this;
    }

    public RezervareBuilder setTipMuzica(ETipMuzica tipMuzica) {
        this.rezervare.setTipMuzica(tipMuzica);
        return this;
    }
}
