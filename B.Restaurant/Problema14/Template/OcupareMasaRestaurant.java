package Problema14.Template;

public class OcupareMasaRestaurant extends AOcupareMasa{
    @Override
    void curatareMasa() {
        System.out.println("1. Se curata masa");
    }

    @Override
    void asezareServetele() {
        System.out.println("2. Se asaza servetele");
    }

    @Override
    void asezareTacamuri() {
        System.out.println("3. Se asaza tacamurile");
    }

    @Override
    void invitarePersoane() {
        System.out.println("4. Este invitata persoana sa se aseze la masa");
    }
}
