package Problema16.ChainOfResponsability;

public class Email extends AHandler{
    @Override
    void notificareClient(Client client) {
        if(client.getEmail() != null && client.getTelefon() == null){
            System.out.println(client.getNume() + " va primi mail");
        }
        else{
            if(getNextHandler() != null){
                getNextHandler().notificareClient(client);
            }
        }
    }
}
