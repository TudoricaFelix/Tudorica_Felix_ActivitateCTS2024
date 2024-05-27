package Problema2.Builder;

public class ContBuilder implements IBuilder{
    private Cont cont;

    public ContBuilder() {
        cont = new Cont(false,false,false);
    }
    @Override
    public Cont build() {
        return cont;
    }

    public ContBuilder setAreSalariu(boolean areSalariu) {
        this.cont.setAreSalariu(areSalariu);
        return this;
    }

    public ContBuilder setAreCardAtasat(boolean areCardAtasat) {
        this.cont.setAreCardAtasat(areCardAtasat);
        return this;
    }

    public ContBuilder setAreInternetBanking(boolean areInternetBanking) {
        this.cont.setAreInternetBanking(areInternetBanking);
        return this;
    }
}
