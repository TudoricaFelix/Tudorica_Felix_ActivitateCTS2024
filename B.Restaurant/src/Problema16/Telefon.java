package Problema16;

public class Telefon extends AHandler{
    @Override
    void notificareClient(Client client) {
        if(client.getTelefon() != null){
            System.out.println(client.getNume() + " va primi SMS");
        }
        else{
            if(getNextHandler() != null){
                getNextHandler().notificareClient(client);
            }
        }
    }
}
