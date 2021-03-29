import java.io.File;
import java.util.ArrayList;

public class MiejsceParkingowe extends Pomieszczenie implements DodajPrzedmiot{

    ArrayList <PojazdPrzedmiot> listaPojazdPrzedmiot;

    public MiejsceParkingowe(double objetosc, Blok blok){
        super(objetosc, blok);
        this.listaPojazdPrzedmiot = new ArrayList<>();
    }

    public MiejsceParkingowe(double dlugosc, double szerokosc, double wysokosc, Blok blok) {
        super(dlugosc, szerokosc, wysokosc,blok);
        this.listaPojazdPrzedmiot = new ArrayList<>();
    }

    void dodajWlasciciela(Osoba wlasciciel) throws ProblematicTenantException {
        if (wlasciciel.listaZaleglychUmow.size() < 3) {
            boolean flaga = false;
            for (Osoba osoba : blok.osiedle.getWlasciciele()) {
                if (osoba == wlasciciel)
                    flaga = true;
            }
            if (flaga) { // mieszka na tym samym osiedlu
                if (wlasciciel.iloscPosiadanychPomieszczen >= 5)
                    System.err.println("Nie dodano nowego wlasciciela " + wlasciciel.imie + " " + wlasciciel.nazwisko + ": wlasciciel osiagnal limit posiadanych nieruchomosci (5)");
                else {
                    this.wlasciciel = wlasciciel;
                    System.out.println("Dodano Osobe do Pomieszczenia jako Wlasiciela");
                    this.wlasciciel.iloscPosiadanychPomieszczen++;
                    this.listaOsob.add(wlasciciel);
                    dataPodpisaniaUmowy = Czas.obecnyCzas;
                    dataKoncaUmowy = dataPodpisaniaUmowy + 30;
                }
            } else
                System.err.println("Nie dodano nowego wlasciciela " + wlasciciel.imie + " " + wlasciciel.nazwisko + ": wlasciciel nie mieszka na tym samym osiedlu");
        }
        else
            throw new ProblematicTenantException(wlasciciel);
    }

    void dodajMieszkanca(Osoba mieszkaniec) {
        int licznik = 0;
        if (this.listaOsob.size() == 0) {
            try {
                dodajWlasciciela(mieszkaniec);
            } catch (ProblematicTenantException e) {
                e.printStackTrace();
            }
        }
        else {
            for (Osoba tmp : listaOsob) {
                if (tmp.osobaID != mieszkaniec.osobaID)
                    licznik++;
            }
            if ((licznik == listaOsob.size()) & wlasciciel != null) {
                listaOsob.add(mieszkaniec);
                System.out.println("Dodano Osobe do Pomieszczenia");

            } else {
                System.err.println("Nie dodano mieszkanca: " + mieszkaniec.imie + " " + mieszkaniec.nazwisko + " osoba jest juz mieszkancem tego domu <POMIEZSCZENIE>");
            }
        }
    }


    public void dodajPrzedmiot(Przemiot przemiot) throws TooManyThingsException {
        double zajeteMiejsce=0;

        for (PojazdPrzedmiot tmp : this.listaPojazdPrzedmiot) {
            zajeteMiejsce = zajeteMiejsce + tmp.objetosc;
        }

        if (zajeteMiejsce+przemiot.objetosc>this.objetosc)
            throw new TooManyThingsException();
        else
            this.listaPojazdPrzedmiot.add(przemiot);
    }

    public void dodajPojazd(Pojazd pojazd) throws TooManyThingsException {
        double zajeteMiejsce=0;

        for (PojazdPrzedmiot tmp : this.listaPojazdPrzedmiot) {
            zajeteMiejsce = zajeteMiejsce + tmp.objetosc;
        }

        if (zajeteMiejsce+pojazd.objetosc>this.objetosc)
            throw new TooManyThingsException();
        else
            this.listaPojazdPrzedmiot.add(pojazd);
    }


    public void usunPrzedmiot(Przemiot przemiot){
        this.listaPojazdPrzedmiot.remove(przemiot);
    }


    public void usunPojazd(Pojazd pojazd){
        this.listaPojazdPrzedmiot.remove(pojazd);
    }

    void usunMieszkanca(Osoba mieszkaniec){
        if(mieszkaniec==this.wlasciciel)
            this.wyczyscMiejsceParkingowe();
        else {
            this.listaOsob.remove(mieszkaniec);
            System.out.println("Usunieto osobe z Pomieszczenia");
        }
    }

    void wyczyscMiejsceParkingowe(){
        System.out.println("usunieto Wlasciciela : Pomieszczenie wyczyszczono");
        this.wlasciciel.iloscPosiadanychPomieszczen--;
        this.listaOsob.clear();
        this.listaPojazdPrzedmiot.clear();
        this.wlasciciel=null;
    }

    public void sprawdzWaznoscUmowy() {
        System.out.println("Sprawdzam waznosc umowy dla pomieszczenia, ID: "+ this.numerID + " Obecna data to: " +Czas.obecnyCzas+ " Data konca umowy to: "+ dataKoncaUmowy + " Data ewentualnej Eksmisji to: "+ dataEksmisji);

        if((Czas.obecnyCzas==dataKoncaUmowy) | (Czas.obecnyCzas == dataKoncaUmowy+1)){
            dataEksmisji = dataKoncaUmowy + 30;
            System.out.println("KONIEC CZASU UMOWY, OBECNY DZIEN:"+ Czas.obecnyCzas);
            System.out.println("EWENTUALNA EKSMISJA, DNIA: "+ dataEksmisji);
            File umowa = new File("tmp");
            this.wlasciciel.umowy.add(umowa);
        }


        if((Czas.obecnyCzas==dataEksmisji) | (Czas.obecnyCzas == dataEksmisji+1)){
            int licznik=0;
            int index=0;
            for (int i=0; i< this.listaPojazdPrzedmiot.size();i++) {
                if (listaPojazdPrzedmiot.get(i).getClass().getSuperclass()==Pojazd.class) {
                    licznik++;
                    index=i;
                }
            }
            if(licznik>0) {
                listaPojazdPrzedmiot.remove(index);
                dataEksmisji=dataEksmisji+60;
                System.out.println("ZNALEZIONO AUTO NA SPRZEDAZ");
                System.out.println("NOWA DATA EKSMISJI DZIEN: "+ dataEksmisji);
            }
            else {
                System.out.println("BRAK AUTA NA SPZEDAZ : WYCZYSZCZONO MIEJSCE PARKINGOWE");
                this.wlasciciel.listaZaleglychUmow.add(this);
                wyczyscMiejsceParkingowe();
            }
        }
    }

    public void odnowUmowe(){
        if (wlasciciel.umowy.size() >= 1) {
            wlasciciel.umowy.remove(0);
        }
        dataPodpisaniaUmowy = Czas.obecnyCzas;
        dataKoncaUmowy = dataPodpisaniaUmowy + 30;
        dataEksmisji = 0;
    }

    public void anulujUmowe () {
        odnowUmowe();
    }


    @Override
    public String toString() {
        return  "listaPojazdPrzedmiot=" + listaPojazdPrzedmiot +
                ", objetosc=" + objetosc +
                ", numerID=" + numerID +
                ", listaOsob=" + listaOsob +
                ", wlasciciel=" + wlasciciel;
    }
}
