package Problema2.Builder;

public class Rezervare {
    private boolean areGeam;
    private boolean areScauneErgonomice;
    private boolean esteDecorataMasa;
    private boolean areMuzicaPersonalizata;
    private ETipMuzica tipMuzica;

    public Rezervare(boolean areGeam, boolean areScauneErgonomice, boolean esteDecorataMasa, boolean areMuzicaPersonalizata, ETipMuzica tipMuzica) {
        this.areGeam = areGeam;
        this.areScauneErgonomice = areScauneErgonomice;
        this.esteDecorataMasa = esteDecorataMasa;
        this.areMuzicaPersonalizata = areMuzicaPersonalizata;
        this.tipMuzica = tipMuzica;
    }

    public void setAreGeam(boolean areGeam) {
        this.areGeam = areGeam;
    }

    public void setAreScauneErgonomice(boolean areScauneErgonomice) {
        this.areScauneErgonomice = areScauneErgonomice;
    }

    public void setEsteDecorataMasa(boolean esteDecorataMasa) {
        this.esteDecorataMasa = esteDecorataMasa;
    }

    public void setAreMuzicaPersonalizata(boolean areMuzicaPersonalizata) {
        this.areMuzicaPersonalizata = areMuzicaPersonalizata;
    }

    public void setTipMuzica(ETipMuzica tipMuzica) {
        this.tipMuzica = tipMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "areGeam=" + areGeam +
                ", areScauneErgonomice=" + areScauneErgonomice +
                ", esteDecorataMasa=" + esteDecorataMasa +
                ", areMuzicaPersonalizata=" + areMuzicaPersonalizata +
                (areMuzicaPersonalizata ? ", tipMuzica=" + tipMuzica : ", Muzica personalizata nu a fost aleasa") +
                '}';
    }
}
