package pltesterkrk3.auta;

import pltesterkrk3.auta.modele.Bmwx3;

public class testaut {
    public  static void  main (String [] args) {
        Bmwx3 autoZony = new Bmwx3("Auto Żony");
        Bmwx3 autoCorki = new Bmwx3("Auto Córki");

        System.out.println(autoZony.getindentyfikator());
        System.out.println(autoCorki.getindentyfikator());

        autoZony.jedz();
        autoCorki.jedz();
        autoZony.stoj();
        autoCorki.stoj();
        autoZony.skrec();
        autoCorki.skrec();
        System.out.println(autoCorki.wersja());
        System.out.println(autoZony.wersja());
    }

}
