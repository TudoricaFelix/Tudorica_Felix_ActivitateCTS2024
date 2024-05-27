package Problema12.ChainOfResponsability;

public abstract class AHandler {
    private AHandler nextHandler;

    public AHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    abstract void alegereMijlocDeTransport(Calator calator);
}
