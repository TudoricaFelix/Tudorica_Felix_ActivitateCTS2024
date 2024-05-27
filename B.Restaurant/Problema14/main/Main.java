package Problema14.main;

import Problema14.Template.AOcupareMasa;
import Problema14.Template.OcupareMasaRestaurant;

public class Main {
    public static void main(String[] args) {
        AOcupareMasa ocupareMasaRestaurant = new OcupareMasaRestaurant();
        System.out.println("Procedura pentru ocuparea unei mese in restaurant:");
        ocupareMasaRestaurant.proceduraOcupareMasa();

    }
}
