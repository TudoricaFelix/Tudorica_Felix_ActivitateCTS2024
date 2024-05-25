package Problema16;

public class NotificareManager extends AHandler{

    @Override
    void notificareClient(Client client) {
        System.out.println("Se va trimite o notificare managerului pentru clientul " + client.getNume());
    }
}
