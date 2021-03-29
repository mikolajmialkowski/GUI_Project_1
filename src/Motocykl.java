public class Motocykl extends Pojazd {

    double pojemnoscSilnika;

    public Motocykl(String nazwa, double objetosc,double pojemnoscSilnika ) {
        super(nazwa, objetosc);
        this.pojemnoscSilnika= pojemnoscSilnika;
    }

    public Motocykl(String nazwa, double dlugosc, double szerokosc, double wysokosc, double pojemnoscSilnika) {
        super(nazwa, dlugosc, szerokosc, wysokosc);
        this.pojemnoscSilnika=pojemnoscSilnika;
    }

    public String toString() {
        return "nazwa Pojazdu: "+nazwa+
                ", objetosc Pojazdu: "+ objetosc+
                ", pojemnosc silnika :" + pojemnoscSilnika+
                ", numer ID: "+ this.PojazdPrzedmiotID;
    }
}
