public abstract class Pojazd extends PojazdPrzedmiot{

    public Pojazd(String nazwa, double objetosc) {
        super(nazwa, objetosc);
    }

    public Pojazd(String nazwa, double dlugosc, double szerokosc, double wysokosc) {
        super(nazwa, dlugosc, szerokosc, wysokosc);
    }
}