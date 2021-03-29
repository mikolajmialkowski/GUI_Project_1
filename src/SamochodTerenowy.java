public class SamochodTerenowy extends Pojazd {

    int dlugoscLinkiHolowniczej;

    public SamochodTerenowy(String nazwa, double objetosc, int dlugoscLinkiHolowniczej) {
        super(nazwa, objetosc);
        this.dlugoscLinkiHolowniczej=dlugoscLinkiHolowniczej;
    }

    public SamochodTerenowy(String nazwa, double dlugosc, double szerokosc, double wysokosc, int dlugoscLinkiHolowniczej) {
        super(nazwa, dlugosc, szerokosc, wysokosc);
        this.dlugoscLinkiHolowniczej= dlugoscLinkiHolowniczej;
    }

    public String toString() {
        return "nazwa Pojazdu: "+nazwa+
                ", objetosc Pojazdu: "+ objetosc+
                ", dlugosc linki holowniczej: " + dlugoscLinkiHolowniczej+
                ", numer ID: "+ this.PojazdPrzedmiotID;
    }
}
