package Problema2.Builder;

public class Cont {
    private boolean areSalariu;
    private boolean areCardAtasat;
    private boolean areInternetBanking;

    public Cont(boolean areSalariu, boolean areCardAtasat, boolean areInternetBanking) {
        this.areSalariu = areSalariu;
        this.areCardAtasat = areCardAtasat;
        this.areInternetBanking = areInternetBanking;
    }

    public void setAreSalariu(boolean areSalariu) {
        this.areSalariu = areSalariu;
    }

    public void setAreCardAtasat(boolean areCardAtasat) {
        this.areCardAtasat = areCardAtasat;
    }

    public void setAreInternetBanking(boolean areInternetBanking) {
        this.areInternetBanking = areInternetBanking;
    }


    @Override
    public String toString() {
        return "Facilitatile contului sunt: " +
                (areSalariu ? "Primeste salariul in cont" : "") +
                (areCardAtasat ? ", Are cardul atasat" : "") +
                (areInternetBanking ? ", Are internet banking" : "");
    }
}
