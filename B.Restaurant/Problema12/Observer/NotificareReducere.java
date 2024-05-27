package Problema12.Observer;

public class NotificareReducere extends Restaurant{
    public void reducerePretMeniu() {
        this.notificareClienti("Pretul unui produs a fost redus. Puteti verifica meniul pe site-ul nostru.");
    }
}
