import java.io.File;
import java.util.ArrayList;

public class Osoba {
    static int MainOsobaID=50;
    int osobaID;
    String imie;
    String nazwisko;
    double pesel;
    String adres;
    String dataUrodzin;
    int iloscPosiadanychPomieszczen=0;
    ArrayList <File> umowy;
    ArrayList <Pomieszczenie> listaZaleglychUmow;

    public Osoba(String imie, String nazwisko, double pesel, String adres, String dataUrodzin) {
        MainOsobaID++;
        this.osobaID=MainOsobaID;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.adres = adres;
        this.dataUrodzin = dataUrodzin;
        this.umowy = new ArrayList<>();
        this.listaZaleglychUmow = new ArrayList<>();
    }

    @Override
    public String toString() {
        return
                "imie: " + imie +
                ", nazwisko: " + nazwisko +
                ",\nPESEL: " + (int)pesel +
                ", adres: " + adres +
                ", dataUrodzin: " + dataUrodzin +
                ",\nilosc posiadanych Pomieszczen: " + iloscPosiadanychPomieszczen +
                ", zalegle umowy: " + umowy.size() +
                ", osobaID: " + osobaID;
    }
}
