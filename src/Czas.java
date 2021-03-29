import java.util.ArrayList;

public class Czas extends Thread {

    public boolean uruchomiony=true;
    public boolean end=true;
    public static int obecnyCzas=1;
    ArrayList<Osiedle> listaOsiedli;
    public Czas(ArrayList<Osiedle> listaOsiedli){
        this.listaOsiedli=listaOsiedli;
    }

    public void run(){
        while (end) {
            while (uruchomiony) {
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                obecnyCzas = obecnyCzas + 1;

                Mieszkanie mieszkanieWaznoscUmowy;
                MiejsceParkingowe miejsceParkingoweWaznoscUmowy;

                if (getObecnyCzas() % 2 == 0) {

                    for (Osiedle osiedle : listaOsiedli) {
                        for (Blok blok : osiedle.listaBlokow) {
                            for (Pomieszczenie pomieszczenie : blok.listaPomieszczen) {
                                if (pomieszczenie.wlasciciel != null) {
                                    if (pomieszczenie.getClass() == Mieszkanie.class) {
                                        mieszkanieWaznoscUmowy = (Mieszkanie) pomieszczenie;
                                        mieszkanieWaznoscUmowy.sprawdzWaznoscUmowy();
                                    }
                                    if (pomieszczenie.getClass() == MiejsceParkingowe.class) {
                                        miejsceParkingoweWaznoscUmowy = (MiejsceParkingowe) pomieszczenie;
                                        miejsceParkingoweWaznoscUmowy.sprawdzWaznoscUmowy();
                                    }
                                }
                            }
                        }
                    }
                }

            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    synchronized public void end(){
        this.end=false;
    }

    synchronized public void zatrzymaj(){
        this.uruchomiony=false;
    }
    synchronized public void wznow(){
        this.uruchomiony=true;
    }
    synchronized public int getObecnyCzas(){
        return obecnyCzas;
    }


}
