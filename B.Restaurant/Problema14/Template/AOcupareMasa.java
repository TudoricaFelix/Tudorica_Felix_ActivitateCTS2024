package Problema14.Template;

public abstract class AOcupareMasa {
    abstract void curatareMasa();
    abstract void asezareServetele();
    abstract void asezareTacamuri();
    abstract void invitarePersoane();

    public final void proceduraOcupareMasa(){
        curatareMasa();
        asezareServetele();
        asezareTacamuri();
        invitarePersoane();
    }
}
