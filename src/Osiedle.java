import java.util.ArrayList;

public class Osiedle {
   ArrayList <Blok> listaBlokow = new ArrayList<>();
    static int mainID = 10;
    int numerID;

    public void dodajBlok(Blok blok){
        this.listaBlokow.add(blok);
    }

    public Osiedle() {
        mainID = mainID + 1;
        this.numerID = mainID;
    }

    public ArrayList<Osoba> getWlasciciele(){
        ArrayList<Osoba> listaWlascicieli= new ArrayList<>();
        for (Blok blok:listaBlokow) {
            for (Pomieszczenie pomieszczenie:blok.listaPomieszczen ) {
                listaWlascicieli.add(pomieszczenie.wlasciciel);
            }
        }
        return listaWlascicieli;
    }


    @Override
    public String toString() {
        return "Osiedle{" +
                "listaBlokow=" + listaBlokow +
                '}';
    }
}


