import java.io.File;
import java.util.ArrayList;

public abstract class Pomieszczenie implements Comparable <Pomieszczenie> {
    public int dataPodpisaniaUmowy;
    public int dataKoncaUmowy;
    public int dataEksmisji;
    static int mainID = 1000;
    double objetosc;
    int numerID;
    ArrayList<Osoba> listaOsob;
    Osoba wlasciciel;
    Blok blok;

    @Override
    public int compareTo(Pomieszczenie pomieszczenie) {
        if (this.objetosc > pomieszczenie.objetosc)
            return 1;
        else
            return -1;
    }

    public Pomieszczenie(double objetosc, Blok blok) {
        this.objetosc = objetosc;
        mainID = mainID + 1;
        this.numerID = mainID;
        listaOsob = new ArrayList<>();
        this.blok = blok;
        this.blok.dodajPomieszczenie(this);
    }

    public Pomieszczenie(double dlugosc, double szerokosc, double wysokosc, Blok blok) {
        this.objetosc = dlugosc * szerokosc * wysokosc;
        mainID = mainID + 1;
        this.numerID = mainID;
        listaOsob = new ArrayList<>();
        this.blok = blok;
    }
}
