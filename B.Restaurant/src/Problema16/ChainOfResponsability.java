package Problema16;

public class ChainOfResponsability {
    public static void main(String[] args) {
        Telefon telefon = new Telefon();
        Email email = new Email();
        NotificareManager notificareManager = new NotificareManager();

        telefon.setNextHandler(email);
        email.setNextHandler(notificareManager);

        Client client1 = new Client("Marius", "07123456789", null);
        Client client2 = new Client("Darius", null, null);
        Client client3 = new Client("Andrei", null,"andrei@gmail.com");
        Client client4 = new Client("Maria","07987423156", "maria@gmail.com");

        System.out.println("Clientul 1");
        telefon.notificareClient(client1);
        System.out.println("\nClientul 2");
        telefon.notificareClient(client2);
        System.out.println("\nClientul 3");
        telefon.notificareClient(client3);
        System.out.println("\nClientul 4");
        telefon.notificareClient(client4);
    }
}