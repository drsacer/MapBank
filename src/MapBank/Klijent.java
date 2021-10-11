package MapBank;

import ListBank.Racun;

import java.util.ArrayList;
import java.util.List;

public class Klijent {

    private int idKlijenta;
    private String ime;
    private String prezime;
    List<Racun> listaRacuna = new ArrayList<>();
    private int brojRacuna;

    public void addRacun (Racun racun) {
        listaRacuna.add(racun);
        brojRacuna++;
    }

    public Racun getRacun (int index) {
        return listaRacuna.get(index);
    }

    public int getBrojRacuna() {
        return brojRacuna;
    }

    public Klijent(String ime, String prezime, int idKlijenta) {
        this.ime = ime;
        this.prezime = prezime;
        this.idKlijenta = idKlijenta;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getIdKlijenta() {
        return idKlijenta;
    }

    @Override
    public String toString() {
        return "Klijent{" +
                "idKlijenta=" + idKlijenta +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", listaRacuna=" + listaRacuna +
                ", brojRacuna=" + brojRacuna +
                '}';
    }
}
