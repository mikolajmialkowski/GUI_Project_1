import java.io.File;
import java.util.ArrayList;

public class Mieszkanie extends Pomieszczenie implements DodajPrzedmiot {

    ArrayList<Przemiot> listPrzedmiotow;

    public Mieszkanie(double powierzchnia, Blok blok) {
        super(powierzchnia, blok);
        this.listPrzedmiotow = new ArrayList<>();
    }

    public void dodajPrzedmiot(Przemiot przemiot) throws TooManyThingsException {
        double zajeteMiejsce=0;

        for (Przemiot tmp : this.listPrzedmiotow) {
                zajeteMiejsce = zajeteMiejsce + tmp.objetosc;
            }

        if (zajeteMiejsce+przemiot.objetosc>this.objetosc)
            throw new TooManyThingsException();
        else
            this.listPrzedmiotow.add(przemiot);
    }

    public void usunPrzedmiot(Przemiot przemiot){
        this.listPrzedmiotow.remove(przemiot);
    }

    void dodajWlasciciela(Osoba wlasciciel) throws ProblematicTenantException {
        if(wlasciciel.listaZaleglychUmow.size()<3) {
            if (wlasciciel.iloscPosiadanychPomieszczen >= 5)
                System.err.println("Nie dodano nowego wlasciciela " + wlasciciel.imie + " " + wlasciciel.nazwisko + ": wlasciciel osiagnal limit posiadanych nieruchomosci (5)");
            else {
                if (this.wlasciciel == null) {
                    System.out.println("Dodano Osobe do Pomieszczenia jako Wlasiciela");
                    this.wlasciciel = wlasciciel;
                    this.wlasciciel.iloscPosiadanychPomieszczen++;
                    this.listaOsob.add(wlasciciel);
                    dataPodpisaniaUmowy = Czas.obecnyCzas;
                    dataKoncaUmowy = dataPodpisaniaUmowy + 30;
                } else
                    System.err.println("Nie dodano nowego wlasciciela " + wlasciciel.imie + " " + wlasciciel.nazwisko + "to pomiesczenie juz ma wlaciciela, aby dodac nowego najpier wyczyc pomiesczenie!");
            }
        }
        else
            throw new ProblematicTenantException(wlasciciel);
    }

    void usunMieszkanca(Osoba mieszkaniec){
        if(mieszkaniec==this.wlasciciel)
            this.wyczyscMieszkanie();
        else {
            this.listaOsob.remove(mieszkaniec);
            System.out.println("Usunieto osobe z Pomieszczenia");
        }
    }

    void wyczyscMieszkanie(){
        this.wlasciciel.iloscPosiadanychPomieszczen--;
        this.wlasciciel=null;
        this.listaOsob.clear();
        this.listPrzedmiotow.clear();
        System.out.println("Usunieto Wlasciciela : Pomieszczenie wyczyszczone");
    }

    @Override
    public String toString() {
        return "listPrzedmiotow=" + listPrzedmiotow +
                ", objetosc=" + objetosc +
                ", numerID=" + numerID +
                ", listaOsob=" + listaOsob +
                ", wlasciciel=" + wlasciciel;
    }

    void dodajMieszkanca(Osoba mieszkaniec){
        int licznik=0;
            if (this.listaOsob.size() == 0) {
                try {
                    dodajWlasciciela(mieszkaniec);
                } catch (ProblematicTenantException e) {
                    e.printStackTrace();
                }
            } else {
                for (Osoba tmp : listaOsob) {
                    if (tmp.osobaID != mieszkaniec.osobaID)
                        licznik++;
                }
                if ((licznik == listaOsob.size()) & wlasciciel != null) {
                    System.out.println("Dodano Osobe do Pomieszczenia");
                    listaOsob.add(mieszkaniec);
                } else {
                    System.err.println("Nie dodano mieszkanca: " + mieszkaniec.imie + " " + mieszkaniec.nazwisko + ", osoba jest juz mieszkancem tego domu");
                }
            }


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
            System.out.println("KONIEC CZASU UMOWY, KONIEC CZASU EKSMISJI, CZYSZCZENIE MIESZKANIA:"+ Czas.obecnyCzas);
            this.wlasciciel.listaZaleglychUmow.add(this);
            wyczyscMieszkanie();
        }

    }

    public void odnowUmowe(){
        if (wlasciciel.umowy.size() >= 1) {
            wlasciciel.umowy.remove(0);
        }
        dataPodpisaniaUmowy = Czas.obecnyCzas;
        dataKoncaUmowy = dataKoncaUmowy + 30;
        dataEksmisji = 0;
    }

    public void anulujUmowe () {
        odnowUmowe();
    }

}


