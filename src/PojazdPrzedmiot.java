public abstract class PojazdPrzedmiot implements Comparable <PojazdPrzedmiot>{
    String nazwa;
    double objetosc;
    static int MainOPojazdPrzedmiotID=700;
    int PojazdPrzedmiotID;

    @Override
    public int compareTo(PojazdPrzedmiot pojazdPrzedmiot) {
        if (this.objetosc > pojazdPrzedmiot.objetosc)
            return -1;
        else if (this.objetosc < pojazdPrzedmiot.objetosc)
            return 1;

        else
            if (this.nazwa.compareTo(pojazdPrzedmiot.nazwa)==1)
                return 1;
            else
                return -1;




    }

    public PojazdPrzedmiot(String nazwa, double objetosc) {
        this.nazwa = nazwa;
        this.objetosc=objetosc;
        MainOPojazdPrzedmiotID++;
        this.PojazdPrzedmiotID=MainOPojazdPrzedmiotID;
    }

    public PojazdPrzedmiot(String nazwa, double dlugosc, double szerokosc, double wysokosc) {
        this.nazwa = nazwa;
        this.objetosc=dlugosc*szerokosc*wysokosc;
        MainOPojazdPrzedmiotID++;
        this.PojazdPrzedmiotID=MainOPojazdPrzedmiotID;
    }
}
