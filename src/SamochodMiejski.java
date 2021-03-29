public class SamochodMiejski extends Pojazd {

    boolean maNapedHybrydowy;

    public SamochodMiejski(String nazwa, double objetosc, boolean maNapedHybrydowy) {
        super(nazwa, objetosc);
        this.maNapedHybrydowy=maNapedHybrydowy;
    }

    public SamochodMiejski(String nazwa, double dlugosc, double szerokosc, double wysokosc, boolean maNapedHybrydowy) {
        super(nazwa, dlugosc, szerokosc, wysokosc);
        this.maNapedHybrydowy=maNapedHybrydowy;
    }
    public String toString() {
        return "nazwa Pojazdu: "+nazwa+
                ", objetosc Pojazdu: "+ objetosc+
                ", czy ma naped hybrydowy?: " + maNapedHybrydowy+
                ", numer ID: "+ this.PojazdPrzedmiotID;
    }
}
