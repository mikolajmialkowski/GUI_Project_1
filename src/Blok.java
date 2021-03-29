import java.util.ArrayList;

public class Blok {
    ArrayList <Pomieszczenie> listaPomieszczen = new ArrayList<>();
    Osiedle osiedle;
    static int mainID = 100;
    int numerID;

    public Blok(Osiedle osiedle) {
        this.osiedle=osiedle;
        mainID = mainID + 1;
        this.numerID = mainID;
        this.osiedle.dodajBlok(this);
    }

    public void dodajPomieszczenie(Pomieszczenie pomieszczenie){
        this.listaPomieszczen.add(pomieszczenie);
    }

    @Override
    public String toString() {
        return " BLOK : listaPomieszczen=" + listaPomieszczen;
    }
}


