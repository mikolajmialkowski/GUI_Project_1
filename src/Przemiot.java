public class Przemiot extends PojazdPrzedmiot {
    public Przemiot(String nazwa, double objetosc) {
        super(nazwa, objetosc);
    }

    public Przemiot(String nazwa, double dlugosc, double szerokosc, double wysokosc) {
        super(nazwa, dlugosc, szerokosc, wysokosc);
    }

    @Override
    public String toString() {
        return "Nazwa Przedmiotu: " + nazwa+
                ", objetosc Przedmiotu: " + objetosc+
                ", numer ID Przedmiotu: " + this.PojazdPrzedmiotID;
    }
}
