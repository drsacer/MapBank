package MapBank;

import java.util.Scanner;

public class TestMapBank {

    public static void main(String[] args) {
        Banka adiko = new Banka();

        Klijent roger = new Klijent("Roger", "Waters", 0);
        Klijent david = new Klijent("David", "Gilmoure",1);
        Klijent syd = new Klijent("Syd", "Barrett",2);

        adiko.addKlijenta(roger);
        adiko.addKlijenta(david);

        adiko.ispisSvihKlijenata();
        System.out.println("U banci postoje " + adiko.getBrojKlijenata() + " klijenta\n");

        System.out.println("*** Dodavanje klijenta ***");

        adiko.addKlijenta(syd);
        adiko.ispisSvihKlijenata();
        System.out.println("U banci postoji " + adiko.getBrojKlijenata() + " klijenta\n");

        System.out.print("Unesite id klijenta kojeg želite ispisati:");
        Scanner s = new Scanner(System.in);
        int idPrint = s.nextInt();
        System.out.println(adiko.getImeKlijenta(idPrint));

        System.out.print("Unesite id klijenta kojeg želite izbrisati:");
        int idRemove = s.nextInt();
        adiko.removeKlijent(idRemove);

        adiko.ispisSvihKlijenata();

        System.out.println("U banci postoje " + adiko.getBrojKlijenata() + " klijenta\n");
    }
}

