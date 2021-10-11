package MapBank;

import java.util.HashMap;
import java.util.Map;

public class Banka {

    private int brojKlijenata = 0;
    Map<Integer, Klijent> mapaKlijenata = new HashMap<>();

    public String  getImeKlijenta(int indeks) {
        return mapaKlijenata.get(indeks).getIme() + " " + mapaKlijenata.get(indeks).getPrezime();
    }

    public void addKlijenta(Klijent klijent) {
        mapaKlijenata.put(klijent.getIdKlijenta(), klijent);
        brojKlijenata++;
    }

    public int getBrojKlijenata() {
        return brojKlijenata;
    }

    public void removeKlijent (int indeks){
        mapaKlijenata.remove(indeks);
        brojKlijenata--;
    }

    public void ispisSvihKlijenata() {
        System.out.println("Mapa klijenata:");
        for (Klijent k : mapaKlijenata.values()) {
            System.out.println(k.getIdKlijenta() + " " + k.getIme() + " " + k.getPrezime());
        }
    }

    @Override
    public String toString() {
        return "Banka{" +
                "brojKlijenata=" + brojKlijenata +
                ", mapaKlijenata=" + mapaKlijenata +
                '}';
    }
}