package Problema12;

public class ChainOfResponsability {
    public static void main(String[] args) {
        Troleibuz troleibuz = new Troleibuz();
        Autobuz autobuz = new Autobuz();
        Tramvai tramvai = new Tramvai();
        Metrou metrou = new Metrou();

        troleibuz.setNextHandler(autobuz);
        autobuz.setNextHandler(tramvai);
        tramvai.setNextHandler(metrou);

        Calator calator1 = new Calator("Ioana", 7);
        Calator calator2 = new Calator("Bogdan", 2);
        Calator calator3 = new Calator("Andreea", 3);
        Calator calator4 = new Calator("Diana", 14);

        System.out.println("Calatorul 1");
        troleibuz.alegereMijlocDeTransport(calator1);
        System.out.println("\nCalatorul 2");
        troleibuz.alegereMijlocDeTransport(calator2);
        System.out.println("\nCalatorul 3");
        troleibuz.alegereMijlocDeTransport(calator3);
        System.out.println("\nCalatorul 4");
        troleibuz.alegereMijlocDeTransport(calator4);
    }
}