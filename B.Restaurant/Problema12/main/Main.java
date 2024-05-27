package Problema12.main;

import Problema12.Observer.Client;
import Problema12.Observer.NotificareAdaugareMeniu;
import Problema12.Observer.NotificareReducere;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Marius");
        Client client2 = new Client("Andreea");
        Client client3 = new Client("Diana");
        Client client4 = new Client("Catalin");

        NotificareAdaugareMeniu notificareAdaugareMeniu = new NotificareAdaugareMeniu();
        NotificareReducere notificareReducere = new NotificareReducere();

        notificareAdaugareMeniu.adaugareClient(client1);
        notificareAdaugareMeniu.adaugareClient(client3);
        notificareAdaugareMeniu.adaugareClient(client4);

        notificareReducere.adaugareClient(client1);
        notificareReducere.adaugareClient(client2);

        notificareAdaugareMeniu.adaugareMeniu();
        notificareReducere.reducerePretMeniu();
    }
}
