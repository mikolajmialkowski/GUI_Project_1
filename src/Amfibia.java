public class Amfibia extends Pojazd {

    double pojemnoscBaku;

    public Amfibia(String nazwa, double objetosc, double pojemnoscBaku) {
        super(nazwa, objetosc);
        this.pojemnoscBaku = pojemnoscBaku;
    }

    public Amfibia(String nazwa, double dlugosc, double szerokosc, double wysokosc, double pojemnoscBaku) {
        super(nazwa, dlugosc, szerokosc, wysokosc);
        this.pojemnoscBaku=pojemnoscBaku;
    }

    @Override
    public String toString() {
        return "nazwa Pojazdu: "+nazwa+
                ", objetosc Pojazdu: "+ objetosc+
                ", pojemnosc baku :" + pojemnoscBaku+
                ", numer ID: "+ this.PojazdPrzedmiotID;
    }
}
