public class Lodz extends Pojazd {

    double glebokosczanurzenia;

    public Lodz(String nazwa, double objetosc, double glebokosczanurzenia) {
        super(nazwa, objetosc);
        this.glebokosczanurzenia=glebokosczanurzenia;
    }

    public Lodz(String nazwa, double dlugosc, double szerokosc, double wysokosc, double glebokosczanurzenia) {
        super(nazwa, dlugosc, szerokosc, wysokosc);
        this.glebokosczanurzenia=glebokosczanurzenia;
    }

    public String toString() {
        return "nazwa Pojazdu: "+nazwa+
                ", objetosc Pojazdu: "+ objetosc+
                ", glebokosc zanurzenia: " + glebokosczanurzenia+
                ", numer ID: "+ this.PojazdPrzedmiotID;
    }

}
